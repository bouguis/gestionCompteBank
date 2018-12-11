package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.gestioncomptebank.service.IServiceEmployeImpl;
import sn.objis.gestioncomptebank.service.IServiceGroupImpl;

/**
 * Servlet implementation class ListeEmpToGrp
 */
public class ListeEmpToGrp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceEmployeImpl service = new IServiceEmployeImpl();
	IServiceGroupImpl serviceGr = new IServiceGroupImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeEmpToGrp() {
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
		long codeGrp = Long.parseLong(request.getParameter("code")) ;

		request.setAttribute("listeEG", service.employeByGroup(codeGrp));
		request.setAttribute("liste", service.findAll());
		request.setAttribute("listeG", serviceGr.getAll() );
		RequestDispatcher rd = request.getRequestDispatcher("admin/empToGroupe.jsp");
		rd.forward(request, response);
	}

}
