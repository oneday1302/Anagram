package ua.foxminded.dynamicweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFacade
{
	public static List<String> getBooks()
	{
		List<String> result = new ArrayList<String>();

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1996"))
		{
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM books.books");
			while (resultSet.next())
			{
				result.add(resultSet.getString("name"));
			}
			
			System.out.println("getBooks was a success");
			
		} catch (SQLException e)
		{
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
		return result;
	}
	
	public static void addBook(String nameBook)
	{
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1996"))
		{
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO books.books (name) VALUES ('" + nameBook + "');";
			statement.executeUpdate(sql);
			
			System.out.println("addBook was a success");
			
		} catch (SQLException e)
		{
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
	}
	
	public static void removeBook(String nameBook)
	{
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1996"))
		{
			Statement statement = connection.createStatement();
			
			String sql = "DELETE FROM books.books WHERE name='" + nameBook + "';";
			statement.executeUpdate(sql);
			
			System.out.println("removeBook was a success");
			
		} catch (SQLException e)
		{
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
	}
}