package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.IUserDao;
import Dao.UserDaoImpl;
import entities.User;

/**
 * Servlet implementation class ControleurServlet
 */
@WebServlet(name = "ControleurServlet", urlPatterns = { "/ControleurServlet", "*.do" })
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IUserDao metier;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public void init() throws ServletException {
		metier = new UserDaoImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/view/Authentification.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (email != "" && password != "") {
			
			User user = metier.getConnexion(email, password);
			if (user != null) {
				List<User> users = metier.getAllUsers();
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				System.out.println(user.getRole());
				if (user.getRole().getId() == 2) {
					response.sendRedirect("abonne");
					//request.getRequestDispatcher("abonne").forward(request, response);
					}

				if (user.getRole().getId() == 1) {
					session = request.getSession();

					userModele model = new userModele();

					model.setUsers(users);

					session.setAttribute("model", model);

					request.getRequestDispatcher("/view/agent.jsp").forward(request, response);

					String path = request.getServletPath();
					if (path.equals("/supprimer.do")) {
						int id = Integer.parseInt(request.getParameter("id"));
						metier.deleteUser(id);
					}
				}
			}
			else {
				request.getRequestDispatcher("/view/Authentification.jsp").forward(request, response);
			}
		}

		if (email.equals("") || password.equals("")) {
			request.getRequestDispatcher("/view/Authentification.jsp").forward(request, response);
		}

	}

}
