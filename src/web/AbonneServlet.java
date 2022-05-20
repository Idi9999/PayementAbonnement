package web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

/**
 * Servlet implementation class AbonneServlet
 */
@WebServlet(name = "abonne", urlPatterns = { "/abonne" })
public class AbonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AbonneServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/view/Abonne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String numcarte = request.getParameter("numcarte");
		String dateExp = request.getParameter("dateExp");
		String numLast = request.getParameter("dernierChf");
		
		/*SimpleDateFormat sdformat = new SimpleDateFormat("MM/dd/yyyy");
		Date dtExp = new Date();
		try {
			 dtExp = sdformat.parse(dateExp);
			//String actuel = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());						
			//else {
				//request.getRequestDispatcher("/view/IncripSucces.jsp").forward(request, response);
			//}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		if (numcarte.length() == 16 && numLast.length() == 3) {
			response.sendRedirect("UplaodFichier");
		}
		if(numcarte.equals("") || dateExp.equals("")  || numLast.equals("")) {
			request.getRequestDispatcher("/view/Abonne.jsp").forward(request, response);
		}
			
	}

}
