package softuni.exam.models.dto;

import com.google.gson.annotations.Expose;
import softuni.exam.models.entity.enums.Genre;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class BookImportDto {

//•	title – accepts char sequence (between 3 to 40 inclusive). The values are unique in the database.
//•	author - accepts char sequence (between 3 to 40 inclusive).
//•	description - a long and detailed description of the book with a character length value higher than or equal to 5.
//•	available – accepts a true or false, representing the availability status of the book.
//•	genre – String enumeration, one of the following – CLASSIC_LITERATURE, SCIENCE_FICTION, FANTASY
//•	rating – accepts number values that are positive.
    @Expose
    @Size(min = 3, max = 40)
    private String author;
    @Expose
    private boolean available;
    @Expose
    @Size(min = 5)
    private String description;
    @Expose
    @Size(min = 3,max = 40)
    private String title;
    @Expose
    @Positive
    private Double rating;

    @Expose
    @Enumerated(EnumType.STRING)
    private Genre genre;

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public BookImportDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public boolean isAvailable() {
        return available;
    }

    public BookImportDto setAvailable(boolean available) {
        this.available = available;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BookImportDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BookImportDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public Double getRating() {
        return rating;
    }

    public BookImportDto setRating(Double rating) {
        this.rating = rating;
        return this;
    }
}
