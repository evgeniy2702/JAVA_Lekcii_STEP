package DesingPattern.MVC_Pattern.Controller;

import DesingPattern.MVC_Pattern.Model.Book;
import DesingPattern.MVC_Pattern.dao.BookDAOImplementation;

import java.util.List;

public class BookController {

    private BookDAOImplementation bookDAO = new BookDAOImplementation();

    public void save (Book book) {
        bookDAO.saveBook(book);
    }

    public void upDate (Long id, Book book) {
        bookDAO.upDate(id,book);
    }

    public void remove (Book book) {
        bookDAO.remove(book);
    }

    public Book getById (Long id) {
        try{
            return bookDAO.getById(id);
        } catch (Exception e){
            System.out.println("Такого id еще нет");
        }
        return new Book();
    }

    public List<Book> getAll(){
        return bookDAO.getAll();
    }
}
