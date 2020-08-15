package DesingPattern.MVC_Pattern.Model;

import DesingPattern.MVC_Pattern.Model.Factory.NamedEntity;

import java.util.jar.Attributes;

public class Book extends NamedEntity {

    String authorBook;

    public Book() {
    }

    public Book(String authorBook) {
        this.authorBook = authorBook;
    }

    public Book (String name, String authorBook){
        super();
        this.authorBook = authorBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "authorBook='" + authorBook + '\'' +
                '}';
    }
}
