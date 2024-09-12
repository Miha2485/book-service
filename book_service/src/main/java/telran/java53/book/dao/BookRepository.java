package telran.java53.book.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java53.book.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {
	
	Stream<Book> findByAuthorsNameIgnoreCase(String name);


	Stream<Book> findByPublisherPublisherName(String name);


}
