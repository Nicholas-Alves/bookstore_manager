package com.nicholasalves.bookstoremanager.service;

import com.nicholasalves.bookstoremanager.dto.MessageResponseDTO;
import com.nicholasalves.bookstoremanager.entity.Book;
import com.nicholasalves.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);

        return MessageResponseDTO.builder()
                .message("Book created with ID: " + savedBook.getId())
                .build();
    }

}
