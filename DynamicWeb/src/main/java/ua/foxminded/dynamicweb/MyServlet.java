package ua.foxminded.dynamicweb;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		List<String> nameBooks = DatabaseFacade.getBooks();
		req.setAttribute("nameBooks", nameBooks);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		if(req.getParameter("command").equals("addBook")) 
		{
			String bookName = req.getParameter("nameBook");
			if(bookName != null)
				DatabaseFacade.addBook(bookName);
		}
		if(req.getParameter("command").equals("removeBook"))
		{
			String bookName = req.getParameter("nameBook");
			if(bookName != null)
				DatabaseFacade.removeBook(bookName);
		}
	}
}