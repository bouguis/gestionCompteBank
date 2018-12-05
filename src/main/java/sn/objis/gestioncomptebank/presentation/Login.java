package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	public enum roles {
		admin,user
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recupération des des données saisies
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		RequestDispatcher rd;
	
		
		try {
			//Transmission des valeurs au serveur pour l'authentification
			request.login(login, password);
			//Redirection vers les spaces dde travails
			if (request.isUserInRole(roles.admin.toString())) {
				request.setAttribute("nom", login);
				
				
			
				response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/admin"));
			
			}else {
				response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/user"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur d'authentifation !!");
			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

}
