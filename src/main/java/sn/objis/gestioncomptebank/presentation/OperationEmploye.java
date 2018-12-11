package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.domaine.Operation;
import sn.objis.gestioncomptebank.service.IServiceCompteImpl;
import sn.objis.gestioncomptebank.service.IServiceOperationImpl;

/**
 * Servlet implementation class OperationEmploye
 */
public class OperationEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IServiceCompteImpl service = new IServiceCompteImpl();
	private IServiceOperationImpl serviceOp = new IServiceOperationImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperationEmploye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("employe/operationEmploye.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		String action1 = request.getParameter("action1");
		//Recuperation du numero de compte
		String numCompte = request.getParameter("compte");
		
		
		
		if (action !=null) {
			
			
			try {
				//Consulter compte
				Compte cp =service.consulterCompte(numCompte);
				
				String typeCompte = cp.getClass().getSimpleName();
				request.setAttribute("compteTrouve", cp);
				request.setAttribute("typeCompte", typeCompte);
				List<Operation>ops = service.consulterOperation(numCompte);
				request.setAttribute("operations", ops);
				//Operations
				
				
			} catch (Exception e) {
				
				String mess = e.getMessage();
				request.setAttribute("exception", mess);
				
			}
			RequestDispatcher rd = request.getRequestDispatcher("employe/operationEmploye.jsp");
			rd.forward(request, response);
		}else if (action1!=null) {
//			HttpSession session = request.getSession();
//			Employe emp = (Employe) session.getAttribute("user");

			double montant = Double.parseDouble(request.getParameter("montant"));
			String cptVire = request.getParameter("compte2");
			String typeOperation = request.getParameter("op");
			String id = request.getParameter("numeroCompte");
			
			
			if (typeOperation.equalsIgnoreCase("retrait")) {
				
				serviceOp.retrait(montant, id,2L );
				
				
				
			} else if (typeOperation.equalsIgnoreCase("versement")) {
				serviceOp.verser(montant, id, 2L);
			
				
			} else if(typeOperation.equalsIgnoreCase("virement")) {
				serviceOp.virement(montant, id, cptVire, 2L);
			}
			try {
				//Consulter compte
				Compte cp =service.consulterCompte(id);
				
				String typeCompte = cp.getClass().getSimpleName();
				request.setAttribute("compteTrouve", cp);
				request.setAttribute("typeCompte", typeCompte);
				List<Operation>ops = service.consulterOperation(id);
				request.setAttribute("operations", ops);
				//Operations
				
				
			} catch (Exception e) {
				
				String mess = e.getMessage();
				request.setAttribute("exception", mess);
				
			}
			RequestDispatcher rd = request.getRequestDispatcher("employe/operationEmploye.jsp");
			rd.forward(request, response);
		}
		
	
		
		
		
	}

}
