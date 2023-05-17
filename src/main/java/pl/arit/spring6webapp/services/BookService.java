package pl.arit.spring6webapp.services;

import pl.arit.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
