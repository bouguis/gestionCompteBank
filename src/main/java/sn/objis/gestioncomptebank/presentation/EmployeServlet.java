package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.Line;

import sn.objis.gestioncomptebank.dao.IDaoEmployeImpl;
import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.service.IServiceEmployeImpl;
import sn.objis.gestioncomptebank.service.IServiceGroupImpl;

/**
 * Servlet implementation class EmployeServlet
 */
public class EmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//instentiation du service
    IServiceEmployeImpl service = new IServiceEmployeImpl();
    IServiceGroupImpl serviceGr = new IServiceGroupImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		request.setAttribute("liste", service.findAll());
		request.setAttribute("listeG", serviceGr.getAll() );
		RequestDispatcher rd = request.getRequestDispatcher("admin/employe.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recupération des valeurs saisies
		
		String nom = request.getParameter("nomprenom");
		long code = Long.parseLong(request.getParameter("code")) ;
		//String g = request.getParameter("groupe");
		
		
		Employe e = new Employe(nom);
		service.addEmpl(e, code);
		request.setAttribute("liste", service.findAll());
		
		
		RequestDispatcher rd = request.getRequestDispatcher("admin/employe.jsp");
		rd.forward(request, response);
		
	}

}
