package DesingPattern.MVC_Pattern.Model.Factory;

import DesingPattern.MVC_Pattern.Model.Book;

public class BookFactory implements EntityFactory<Book> {
    @Override
    public Book createEntity() {
        return new Book();
    }
}
