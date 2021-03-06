package com.nicholasalves.bookstoremanager.mapper;

import com.nicholasalves.bookstoremanager.dto.BookDTO;
import com.nicholasalves.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
