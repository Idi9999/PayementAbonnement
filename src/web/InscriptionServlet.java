package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.IRoleDao;
import Dao.IUserDao;
import Dao.RoleDaoImpl;
import Dao.UserDaoImpl;
import entities.Role;
import entities.User;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet(name = "Inscription", urlPatterns = { "/Inscription" })
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IUserDao pdao;
	IRoleDao r;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public void init() throws ServletException {
		pdao = new UserDaoImpl();
		r = new RoleDaoImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/view/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");

		Role role = r.getRole(2);
		if (nom != "" && prenom != "" && email != "" && phone != "" && password != "") {
			User user = new User();
			user.setNom(nom);
			user.setPrenom(prenom);
			user.setEmail(email);
			user.setPassword(password);
			user.setPhone(phone);
			user.setRole(role);

			pdao.save(user);
			request.getRequestDispatcher("/view/IncripSucces.jsp").forward(request, response);
		}
		if (nom == "" || prenom == "" || email == "" || phone == "" || password == ""){
			request.getRequestDispatcher("/view/inscription.jsp").forward(request, response);
		}

	}

}
