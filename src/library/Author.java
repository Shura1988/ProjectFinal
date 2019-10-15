package library;

import java.sql.Date;
import java.util.Set;

public class Author {
    private Integer id;
    private String name;
    private Set<Book> books;
    private Date birthDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{ id:" + id
                + " ,name : " + name
                + " , birthDate:  " + birthDate
                + " , books: " + books
                + " } ";
    }

}

