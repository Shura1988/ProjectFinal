package library;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RunLibrary {

    public static void booksList(Connect connect) throws SQLException {

        Statement statement = connect.getConnection().createStatement();
        String str = "select * from book b join author a on b.author_id = a.id join genre g on b.genre_id = g.id";
        ResultSet rs1 = statement.executeQuery(str);

        while (rs1.next()) {
            List<Author> authors = new ArrayList<>();
            Book book = new Book();
            Author author = new Author();
            author.setId(rs1.getInt("id"));
            author.setName(rs1.getString("Name"));
            author.setBirthDate(rs1.getDate("birstDate"));
            book.setId(rs1.getInt("id"));
            book.setBookName(rs1.getString("bookName"));
            book.setGenre(rs1.getString("genre"));
            book.setISBN(rs1.getString("ISBN"));
            book.setPrintDate(rs1.getDate("printDate"));
            author.setBooks(Collections.singleton(book));
            authors.add(author);
            System.out.println(authors);
        }
    }


    public static void main(String[] args) throws SQLException {
        Connect connect = new Connect();

        // Добавление Книги или автораб удаление
        //library.BookAuthor.inpatAuthor(connection);
        // library.BookAuthor.inpatBook(connection);
        // library.BookAuthor.delete(connection);
        // library.BookAuthor.update(connection);

        booksList(connect); //вывод таблицы

    }
}
