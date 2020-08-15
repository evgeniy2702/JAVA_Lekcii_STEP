package DesingPattern.MVC_Pattern.dao;

import DesingPattern.MVC_Pattern.Model.Book;
import StructerPattern.Composites.GreenTriangle;

import java.util.ArrayList;
import java.util.List;

public class BookDAOImplementation implements GenericDAO<Book, Long> {

    private List<Book> books = new ArrayList<>();

    @Override
    public void saveBook(Book book) {
        books.add(book);
    }

    @Override
    public void upDate(Long id, Book book) {
        books.set(Math.toIntExact(id), book);
    }

    @Override
    public void remove(Book book) {
        books.remove(book);
    }

    @Override
    public Book getById(Long id) {
        return books.get(Math.toIntExact(id));
    }
    @Override
    public List<Book> getAll() {
        return books;
    }
}
