package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestioncomptebank.dao.IDaoGroupeImpl;
import sn.objis.gestioncomptebank.domaine.Groupe;
import sn.objis.gestioncomptebank.service.IServiceGroupImpl;

/**
 * Servlet implementation class GroupeServlet
 */
public class GroupeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GroupeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IServiceGroupImpl service = new IServiceGroupImpl();
		request.setAttribute("liste", service.getAll());
		RequestDispatcher rd = request.getRequestDispatcher("admin/groupe.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recupération des valeurs saisies
		String groupe = request.getParameter("groupe");
		IServiceGroupImpl service = new IServiceGroupImpl();
		service.add(new Groupe(groupe));
		request.setAttribute("liste", service.getAll());
		RequestDispatcher rd = request.getRequestDispatcher("admin/groupe.jsp");
		rd.forward(request, response);
	}

}
