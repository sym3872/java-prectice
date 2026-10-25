package Book;

import java.util.ArrayList;

public class Libtay {
    private ArrayList<Book> books;
    public Libtay(){}
    public void addBook(Book book){
        books.add(book);
    }
    public void borrowBook(String title) {
        for (Book book : books){
            if (book.getTitle().equals(title)){
                if (book.isBorrow() == false){
                    book.borrow();
                }
            }
        }
    }
    public void returnBook(String title){
        for (Book book : books){
            if (book.getTitle().equals(title)){
                if (!book.isBorrow() == false){
                    book.returnBook();
                }
            }
        }
    }
    public void printAvailableBooks(){
        for (Book book : books){
            if(book.isBorrow() == false){
                System.out.println(book.getTitle());
            }
        }
    }
}
