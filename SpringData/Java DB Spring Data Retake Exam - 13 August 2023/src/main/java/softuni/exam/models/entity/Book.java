package softuni.exam.models.entity;



import softuni.exam.models.entity.enums.Genre;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book extends BaseEntity{

//•	title – accepts char sequence (between 3 to 40 inclusive). The values are unique in the database.
//•	author - accepts char sequence (between 3 to 40 inclusive).
//•	description - a long and detailed description of the book with a character length value higher than or equal to 5.
//•	available – accepts a true or false, representing the availability status of the book.
//•	genre – String enumeration, one of the following – CLASSIC_LITERATURE, SCIENCE_FICTION, FANTASY
//•	rating – accepts number values that are positive.

    @Column(unique = true, nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private boolean available;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genre genre;

    @Column(nullable = false)
    private double rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
