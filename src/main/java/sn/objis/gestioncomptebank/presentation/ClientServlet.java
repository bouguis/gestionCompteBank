package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestioncomptebank.domaine.Client;
import sn.objis.gestioncomptebank.service.IServiceClientImpl;

/**
 * Servlet implementation class ClientServlet
 */
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceClientImpl service = new IServiceClientImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("listeClients", service.getAll());
		RequestDispatcher rd = request.getRequestDispatcher("admin/client.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nomprenom");
		String adresse = request.getParameter("adresse");
		
		service.add(new Client(nom, adresse));
		request.setAttribute("listeClients", service.getAll());
		RequestDispatcher rd = request.getRequestDispatcher("admin/client.jsp");
		rd.forward(request, response);
	}

}
