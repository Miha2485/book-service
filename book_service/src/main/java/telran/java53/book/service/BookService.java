package telran.java53.book.service;

import telran.java53.book.dto.AuthorDto;
import telran.java53.book.dto.BookDto;

public interface BookService {
	boolean addBook(BookDto bookDto);

	BookDto findBookByIsbn(String isbn);

	BookDto remove(String isbn);

	BookDto updateBook(String isbn, String title);

	Iterable<BookDto> findBooksByAuthor(String authorName);

	Iterable<BookDto> findBooksByPublisher(String publisherName);

	Iterable<AuthorDto> findBookAuthors(String isbn);

	AuthorDto removeAuthor(String authorName);
}
