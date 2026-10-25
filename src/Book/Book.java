package Book;

public class Book {
    private String title;
    private String author;
    private boolean isBorrow;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
        this.isBorrow = false;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isBorrow(){
        return isBorrow;
    }
    public void borrow(){
        isBorrow = true;
    }
    public void returnBook(){
        isBorrow = false;
    }
}
