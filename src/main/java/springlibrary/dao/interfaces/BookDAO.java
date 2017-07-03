package springlibrary.dao.interfaces;


import springlibrary.entities.Author;
import springlibrary.entities.Book;
import springlibrary.entities.Genre;

import java.util.List;


public interface BookDAO {

    List<Book> getBooks();

    List<Book> getBooks(Author author);

    List<Book> getBooks(String bookName);

    List<Book> getBooks(Genre genre);

    List<Book> getBooks(Character letter);

    Object getFieldValue(Long id, String fieldName);

}
