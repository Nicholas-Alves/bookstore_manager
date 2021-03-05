package com.nicholasalves.bookstoremanager.repository;

import com.nicholasalves.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
