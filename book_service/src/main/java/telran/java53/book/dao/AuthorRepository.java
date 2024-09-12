package telran.java53.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java53.book.model.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
