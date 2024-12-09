package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.LibraryMemberImportDto;

import softuni.exam.models.entity.BorrowingRecord;
import softuni.exam.models.entity.LibraryMember;
import softuni.exam.repository.LibraryMemberRepository;
import softuni.exam.service.BookService;
import softuni.exam.service.LibraryMemberService;
import softuni.exam.util.ValidationUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;



    @Service
    public class LibraryMemberServiceImpl implements LibraryMemberService {

        private static final String LIBRARY_MEMBER_FILE_PATH = "src/main/resources/files/json/library-members.json";

        private final LibraryMemberRepository libraryMemberRepository;
        private final ValidationUtils validationUtils;
        private final ModelMapper modelMapper;
        private final Gson gson;

        public LibraryMemberServiceImpl(LibraryMemberRepository libraryMemberRepository, ValidationUtils validationUtils, ModelMapper modelMapper, Gson gson) {
            this.libraryMemberRepository = libraryMemberRepository;
            this.validationUtils = validationUtils;
            this.modelMapper = modelMapper;
            this.gson = gson;
        }

        @Override
        public boolean areImported() {
            return this.libraryMemberRepository.count() > 0;
        }

        @Override
        public String readLibraryMembersFileContent() throws IOException {
            return Files.readString(Path.of(LIBRARY_MEMBER_FILE_PATH));
        }



        @Override
        public String importLibraryMembers() throws IOException {
            StringBuilder sb = new StringBuilder();

            Arrays.stream(gson
                            .fromJson(readLibraryMembersFileContent(), LibraryMemberImportDto[].class))
                    .filter(libraryMemberInsertDto -> {
                        boolean isValid = validationUtils.isValid(libraryMemberInsertDto);

                        Optional<LibraryMember> libraryMemberRepositoryByPhoneNumber = libraryMemberRepository.findByPhoneNumber(libraryMemberInsertDto.getPhoneNumber());
                        if (libraryMemberRepositoryByPhoneNumber.isPresent()) {
                            isValid = false;
                        }

                        sb.append(isValid
                                        ? String.format("Successfully imported library member %s - %s", libraryMemberInsertDto.getFirstName()
                                        , libraryMemberInsertDto.getLastName())
                                        : "Invalid library member")
                                .append(System.lineSeparator());

                        return isValid;
                    })
                    .map(libraryMemberImportDto -> modelMapper.map(libraryMemberImportDto, LibraryMember.class))
                    .forEach(libraryMemberRepository::save);

            return sb.toString().trim();
        }

    @Override
    public LibraryMember findMemberById(Long id) {
        return libraryMemberRepository.findById(id).orElse(null);
    }

    @Override
    public void addAndSaveAddedStar(LibraryMember libraryMember, BorrowingRecord borrowingRecord) {
//        libraryMember.getObservers().add(borrowingRecord);
        libraryMemberRepository.save(libraryMember);
    }

    @Override
    public String exportLibraryMembers() {
        StringBuilder sb = new StringBuilder();

//        Set<LibraryMember> allByTypeAndObserversIsNull = starRepository.findAllByStarTypeAndObserversIsNullOrderByLightYearsAsc(Genre.RED_GIANT);

//        allByTypeAndObserversIsNull
//                .forEach(star -> {
//                    sb.append(String.format("LibraryMember: %s\n" +
//                                    "   *Distance: %.2f light years\n" +
//                                    "   **Description: %s\n" +
//                                    "   ***Book: %s",
//                            star.getName(),
//                            star.getLightYears(),
//                            star.getDescription(),
//                            star.getConstellation().getName()))
//                            .append(System.lineSeparator());
//                });

        return sb.toString().trim();
    }
}
