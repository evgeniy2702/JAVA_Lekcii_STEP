package DesingPattern.MVC_Pattern.View;

import DesingPattern.MVC_Pattern.Controller.BookController;
import DesingPattern.MVC_Pattern.Model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {

    static Scanner scanner = new Scanner(System.in);

    BookController bookController = new BookController();

    public void showBookMenu(){
        System.out.println("Book");
        System.out.println("1 - create Book");
        System.out.println("2 - find Book");
        System.out.println("3 - view all Book");


        Integer choice = -1;
        while(true){
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    createBookMenu();
                    break;
                case 2:
                    findBookMenu();
                case 3:
                    getAllBooks();
            }
        }
    }

    public void getAllBooks(){

        ArrayList<Book> books = (ArrayList<Book>) bookController.getAll();

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("Book");
        System.out.println("1 - create Book");
        System.out.println("2 - find Book");
        System.out.println("3 - view all Book");

    }

    public void findBookMenu(){

//Здесь можем добавить удаление , изменение книги и прочии манипуляции с ней
        System.out.println("Finding book");
        System.out.println("Enter id book to start research");
        Long id = scanner.nextLong();
        Book book = bookController.getById(id);

        if(book.isNew()){
            System.out.println("This book is not");
        } else {
            System.out.println(book);
        }
        System.out.println("Book");
        System.out.println("1 - create Book");
        System.out.println("2 - find Book");
        System.out.println("3 - view all Book");

    }

    private void createBookMenu(){
        Book book = new Book();
        System.out.println("Create Book");

        while(book.getId() == null) {
            System.out.println("Enter book id");
            Long id = scanner.nextLong();
            if(bookController.getById(id).getId() != null){
                System.out.println("Такаякнига уже есть!");
            } else {
                book.setId(id);
            }
        }
        while (book.getName() == null  || book.getName().isBlank()){
            System.out.println("Enter book name");
            book.setName(scanner.nextLine());
        }
        while (book.getAuthorBook() == null  || book.getAuthorBook().isBlank()){
            System.out.println("Enter book author");
            book.setAuthorBook(scanner.nextLine());
        }

        bookController.save(book);

        System.out.println("Book");
        System.out.println("1 - create Book");
        System.out.println("2 - find Book");
        System.out.println("3 - view all Book");

    }
}
