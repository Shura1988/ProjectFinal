package library;
import java.util.Date;
public class Book {
    private int id;
    private String bookName;
    private Author author;
    private String genre;
    private String ISBN;
    private Date printDate;


    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getPrintDate() {
        return printDate;
    }

    public void setPrintDate(Date printDate) {
        this.printDate = printDate;
    }

    @Override
    public String toString() {
        return " library.Book " + " { " + " id " + id + " , name : " + bookName /*+ " , author : " + author*/ +
                " , genre : " + genre + ", ISBN " + ISBN + " , printDate " + printDate + "}";
    }


}


