package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.service.IServiceCompteImpl;

/**
 * Servlet implementation class OpperationServlet
 */
public class OperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IServiceCompteImpl service = new IServiceCompteImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("admin/operationCompte.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperation du numero de compte
		String numCompte = request.getParameter("compte");
		
			try {
				//Consulter compte
				Compte cp =service.consulterCompte(numCompte);
				
				String typeCompte = cp.getClass().getSimpleName();
				request.setAttribute("compteTrouve", cp);
				request.setAttribute("typeCompte", typeCompte);
				
			} catch (Exception e) {
				
				String mess = e.getMessage();
				request.setAttribute("exception", mess);
				
			}

		
		
			
			
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("admin/operationCompte.jsp");
		rd.forward(request, response);
		
	}

}
