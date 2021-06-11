package stack.labs;

public class Book {
    private String bookName, isbn, author;
    private int yearLaunch;

    public Book() {}

    public Book(String bookName, String isbn, String author, int yearLaunch) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.yearLaunch = yearLaunch;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearLaunch() {
        return yearLaunch;
    }

    public void setYearLaunch(int yearLaunch) {
        this.yearLaunch = yearLaunch;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", yearLaunch=" + yearLaunch +
                '}';
    }
}
