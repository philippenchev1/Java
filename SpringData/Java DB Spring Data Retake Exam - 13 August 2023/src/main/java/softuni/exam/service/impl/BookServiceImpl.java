package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.BookImportDto;
import softuni.exam.models.entity.Book;
import softuni.exam.repository.BookRepository;
import softuni.exam.service.BookService;

import softuni.exam.util.ValidationUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private static final String BOOKS_FILE_PATH = "src/main/resources/files/json/books.json";

    private final ModelMapper modelMapper;
    private final Gson gson;
    private final ValidationUtils validationUtil;
    private final BookRepository bookRepository;

    public BookServiceImpl(ModelMapper modelMapper, Gson gson, ValidationUtils validationUtils, ValidationUtils validationUtil, BookRepository bookRepository) {
        this.modelMapper = modelMapper;
        this.gson = gson;
        this.validationUtil = validationUtil;
        this.bookRepository = bookRepository;
    }

    @Override
    public boolean areImported() {
        return bookRepository.count() > 0;
    }

    @Override
    public String readBooksFromFile() throws IOException {
        return Files
                .readString(Path.of(BOOKS_FILE_PATH));
    }

    @Override
    public String importBooks() throws IOException {

        StringBuilder sb = new StringBuilder();

        Arrays.stream(gson
                .fromJson(readBooksFromFile(), BookImportDto[].class))
                .filter(bookImportDto -> {
                    boolean isValid = validationUtil.isValid(bookImportDto);

                    Optional<Book> bookByTitle = bookRepository.findBookByTitle(bookImportDto.getTitle());
                    if (bookByTitle.isPresent()) {
                        isValid = false;
                    }

                    sb.append(isValid
                            ? String.format("Successfully imported book %s - %s", bookImportDto.getAuthor()
                            , bookImportDto.getTitle())
                            : "Invalid book")
                            .append(System.lineSeparator());

                    return isValid;
                })
                .map(bookImportDto -> modelMapper.map(bookImportDto, Book.class))
                .forEach(bookRepository::save);

        return sb.toString().trim();
    }

    @Override
    public Optional<Book> getBookById(Long bookId) {
        return bookRepository.findById(bookId);
    }

    @Override
    public void saveAddedStarInConstellation(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book getBookByTitle(String title) {
        return bookRepository.findBookByTitle(title).orElse(null);
    }

}
