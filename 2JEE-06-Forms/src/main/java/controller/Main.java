package controller;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Montant;

/**
 * Servlet implementation class Main
 */
@WebServlet("")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/CurrencyConverter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Montant montant = new Montant();
		String amountS = request.getParameter("amount");
		String currencyS = request.getParameter("currency");
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println(amountS);
		
		int amount = 0;
		try {
			amount = Integer.parseInt(amountS);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block

			request.setAttribute("error", "You have entered wrong format of number!!!");
	
		}
		
		
		try {
			if (currencyS.equals("0")) {
				montant.setDollar(amount);
				
			} else {
				montant.setEuro(amount);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("dollar", df.format(montant.getDollar()));
		request.setAttribute("euro", df.format(montant.getEuro()));
		
		doGet(request, response);
		
	}

}
