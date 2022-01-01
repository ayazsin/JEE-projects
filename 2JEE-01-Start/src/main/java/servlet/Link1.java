package servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Link1")
public class Link1 extends HttpServlet{
	
	@SuppressWarnings("unused")
	private static final long serialVersion = 1L;
	
	public Link1() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = "My name is Bond, ";
		s += "James Bond, il est: " + dateFormat.format(java.util.Calendar.getInstance().getTime());
		System.out.println("Dans le servlet(java): " + s);
		response.getWriter().append("<html><head><title>title</title></head><body>Hi, how are you?</body></html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	

}
