package telran.java53.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java53.book.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {


}

