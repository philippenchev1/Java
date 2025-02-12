package softuni.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.exam.models.entity.Book;
import softuni.exam.models.entity.LibraryMember;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


   Optional<Book> findBookByTitle(String title);
}
