package com.example.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBasee
{
    Connection connection = null;
    public DataBasee()
    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ketabton","root","");
            if(connection==null)
            {
                System.out.println("Failed");
            }
            else
            {
                System.out.println("Success");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public int addBook(int i , String name , String author , String publisher)
    {
        int result=0;

        // insertion
        try {
            PreparedStatement statement =
                    connection.prepareStatement("INSERT INTO book ( book_id, book_name, book_author, book_publisher ) VALUES (?,?,?,?); ");
            statement.setInt(1,i);
            statement.setString(2,name);
            statement.setString(3,author);
            statement.setString(4,publisher);

            result = statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return result;
    }
}
