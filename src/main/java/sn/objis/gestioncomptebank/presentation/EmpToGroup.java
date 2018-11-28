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
 * Servlet implementation class EmpToGroup
 */
public class EmpToGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpToGroup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IServiceEmployeImpl service = new IServiceEmployeImpl();
		IServiceGroupImpl serviceGr = new IServiceGroupImpl();
		
		request.setAttribute("liste", service.findAll());
		request.setAttribute("listeG", serviceGr.getAll() );
		RequestDispatcher rd = request.getRequestDispatcher("admin/empToGroupe.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long idEmp = Long.parseLong(request.getParameter("codeEmp")) ;
		long idGrp = Long.parseLong(request.getParameter("codeGrp")) ;
		IServiceEmployeImpl service = new IServiceEmployeImpl();
		IServiceGroupImpl serviceGr = new IServiceGroupImpl();
		service.addEmpToGrp(idEmp, idGrp);
		request.setAttribute("liste", service.findAll());
		request.setAttribute("listeG", serviceGr.getAll() );
		RequestDispatcher rd = request.getRequestDispatcher("admin/empToGroupe.jsp");
		rd.forward(request, response);
	}

}
