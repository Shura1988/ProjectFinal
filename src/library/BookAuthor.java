package library;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public interface BookAuthor {

    static void inpatAuthor(Connect connection) throws SQLException {
        String str = "insert into Author (id, name, birstDate) values (?,?,?)";
        PreparedStatement pst = connection.getConnection().prepareStatement(str);
        pst.setInt(1, 6);
        pst.setString(2, "Пушкин Александр Сергеевич");
        pst.setDate(3, Date.valueOf("1799-05-26"));
        pst.executeUpdate();
        System.out.println("Автор  добавлен");
    }

    static void inpatBook(Connect connection) throws SQLException {
        String str1 = "insert into book (id, bookName, genre_ID, ISBN, printDate) values (?,?,?,?,?)";
        PreparedStatement pst1 = connection.getConnection().prepareStatement(str1);
        pst1.setInt(1, 7);
        pst1.setString(2, "Евгений Онегин ");
        pst1.setInt(3, 2);
        pst1.setString(4, "13031");
        pst1.setDate(5, Date.valueOf("1832-01-01"));
        pst1.executeUpdate();
        System.out.println("Строки добавлены");
    }

    static void delete(Connect connection) throws SQLException {
        String str2 = "delete from author where id=5";
        PreparedStatement pst1 = connection.getConnection().prepareStatement(str2);
        pst1.executeUpdate();
        System.out.println("Строки удалены");
    }

    static void update(Connect connection) throws SQLException {
        String str3 = "UPDATE author SET Name = 'Gabriel José de la Concordia García Márquez' WHERE ID = 3";
        PreparedStatement pst3 = connection.getConnection().prepareStatement(str3);
        pst3.executeUpdate();
        System.out.println("Строки обнавлены");
    }
}
