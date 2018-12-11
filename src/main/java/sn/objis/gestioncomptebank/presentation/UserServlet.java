package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.service.IServiceClientImpl;
import sn.objis.gestioncomptebank.service.IServiceCompteImpl;
import sn.objis.gestioncomptebank.service.IServiceEmployeImpl;
import sn.objis.gestioncomptebank.service.IServiceGroupImpl;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceEmployeImpl service = new IServiceEmployeImpl();
	IServiceClientImpl serviceCli = new IServiceClientImpl();
	IServiceGroupImpl serviceGrp = new IServiceGroupImpl();
	IServiceCompteImpl serviceCompte = new IServiceCompteImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setAttribute("NombreEmp", service.findAll().size());
		request.setAttribute("NombreClient", serviceCli.getAll().size());
		request.setAttribute("NombreGroupe", serviceGrp.getAll().size());
		request.setAttribute("NombreCompte",serviceCompte.getAll().size() );
		HttpSession session = request.getSession();
		Employe emp = (Employe) session.getAttribute("user");
		request.setAttribute("nom", emp);
		
		RequestDispatcher rd = request.getRequestDispatcher("employe/employe.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
