package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.service.IServiceEmployeImpl;

/**
 * Servlet implementation class supprimer
 */
public class supprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public supprimer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long idSup = Long.parseLong(request.getParameter("idSup"));
		IServiceEmployeImpl service = new IServiceEmployeImpl();
		service.delete(new Employe(idSup) );
		request.setAttribute("liste", service.findAll());
		RequestDispatcher rd = request.getRequestDispatcher("admin/employe.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
