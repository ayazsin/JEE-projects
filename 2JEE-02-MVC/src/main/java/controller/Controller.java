package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model1;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Sum")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			
		
		String p1String = request.getParameter("p1");
		String p2String = request.getParameter("p2");
		
		
		int p1 = 0;
		int p2 = 0;
		try {
			p1 = Integer.parseInt(p1String);
			p2 = Integer.parseInt(p2String);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			
		}
		
		Model1 model = new Model1(p1, p2);
		System.out.println(model);
		request.setAttribute("p1", model.getP1());
		request.setAttribute("p2", model.getP2());
		request.setAttribute("sum", model.getSum());
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
