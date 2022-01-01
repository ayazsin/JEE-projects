package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OutOfAgeException;
import model.Person;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ageS = request.getParameter("age");
		int age = 0;
		try {
			age = Integer.parseInt(ageS);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		}
		
	
		//	this.getServletContext().getRequestDispatcher("/WEB-INF/PersonForm.jsp").forward(request, response);
			
		
		System.out.println(age);
//		
//		if (age < 101) {
//			
//		} else {
//			request.setAttribute("error", "You have entered wrong age!!!");
//			
//			
//		}
			try {
				if(age>0 && age<101) {
					this.getServletContext().getRequestDispatcher("/WEB-INF/Person.jsp").forward(request, response);
					System.out.println("ilk "+response.toString());
				}else {
					throw new OutOfAgeException();
				}
			}catch(OutOfAgeException e) {
				request.setAttribute("error", "You have entered wrong age!!!");
				System.out.println("son "+response);
				this.getServletContext().getRequestDispatcher("/WEB-INF/PersonForm.jsp").forward(request, response);
				
				
			}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String ageS = request.getParameter("age");
		
		int age = 0;
		try {
			age = Integer.parseInt(ageS);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		}
		
		
		person.setAge(age);
		person.setPersonCat();
		
		
		
		request.setAttribute("firstnameS", firstname);
		request.setAttribute("lastnameS", lastname);
		request.setAttribute("ageS", ageS);
		request.setAttribute("personCat", person.getPersonCat().toString());
		doGet(request, response);
	}

}
