package Book;

public class B_L_main {
    public static void main(String[] args) {
        Libtay library = new Libtay();

        library.addBook(new Book("자바의 정석", "남궁성"));
        library.addBook(new Book("혼자 공부하는 자바", "신용권"));
        library.addBook(new Book("이것이 자바다", "신용권"));

        library.borrowBook("자바의 정석");
        library.borrowBook("자바의 정석");

        System.out.println("\n[대출 가능한 책 목록]");
        library.printAvailableBooks();

        library.returnBook("자바의 정석");
        library.borrowBook("없는 책");

        System.out.println("\n[최종 대출 가능 목록]");
        library.printAvailableBooks();
    }
}
