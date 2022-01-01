package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import model.Employee;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/Employee")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idS = request.getParameter("id");
		int id = 0;
		try {
			id = Integer.parseInt(idS);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			
		}
		
		EmployeeDao employee = new EmployeeDao();
		Employee emp = new Employee();
		try {
			emp = employee.get(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(emp.getFirst_name()==null && id != 0) {
			request.setAttribute("error", "THERE IS NO SUCH RECORD!!!");
			
		}
		List<Employee> empList = new ArrayList<>();
		try {
			empList = employee.get();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("empList", empList);
		
		System.out.println(emp);
		request.setAttribute("emp", emp);
		
		String idDelS = request.getParameter("idDel");
		int idDel = 0;
		
		try {
			idDel = Integer.parseInt(idDelS);
		} catch (NumberFormatException e) {
			
		}
		
		try {
			employee.delete(idDel);
			if(idDel != 0) {
			request.setAttribute("delete", "Success! Your record is deleted...");
			this.getServletContext().getRequestDispatcher("/WEB-INF/employee.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/employee.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
