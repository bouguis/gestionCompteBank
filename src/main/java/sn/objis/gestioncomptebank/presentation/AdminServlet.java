package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestioncomptebank.service.IServiceClientImpl;
import sn.objis.gestioncomptebank.service.IServiceEmployeImpl;
import sn.objis.gestioncomptebank.service.IServiceGroupImpl;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        
    }
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IServiceEmployeImpl service = new IServiceEmployeImpl();
		IServiceClientImpl serviceCli = new IServiceClientImpl();
		IServiceGroupImpl serviceGrp = new IServiceGroupImpl();
		
		
		request.setAttribute("NombreEmp", service.findAll().size());
		request.setAttribute("NombreClient", serviceCli.getAll().size());
		request.setAttribute("NombreGroupe", serviceGrp.getAll().size());
		RequestDispatcher rd = request.getRequestDispatcher("admin/admin.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
