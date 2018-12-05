package sn.objis.gestioncomptebank.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.objis.gestioncomptebank.dao.IDaoCompteImpl;
import sn.objis.gestioncomptebank.dao.IDaoEmployeImpl;
import sn.objis.gestioncomptebank.domaine.Client;
import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.CompteCourant;
import sn.objis.gestioncomptebank.domaine.CompteEpargne;
import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.service.IServiceClientImpl;
import sn.objis.gestioncomptebank.service.IServiceCompteImpl;
import sn.objis.gestioncomptebank.service.IServiceEmployeImpl;

/**
 * Servlet implementation class CompteServlet
 */
public class CompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IServiceClientImpl serviceCli = new IServiceClientImpl();
	IServiceCompteImpl serviceCompte = new IServiceCompteImpl();
	IServiceEmployeImpl serviceEmp = new IServiceEmployeImpl();
	IDaoCompteImpl dao = new IDaoCompteImpl();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listeCompte", serviceCompte.getAll());
		
		
		RequestDispatcher rd = request.getRequestDispatcher("admin/compte.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String adresse = request.getParameter("adresse");
		String numeroCompt = request.getParameter("numero");
		double taux = Double.parseDouble(request.getParameter("teaux"));
		double solde = Double.parseDouble(request.getParameter("solde"));
		String typeCompte = request.getParameter("compte");
		Client client = new Client(nom, adresse);
		
		
		
		
		serviceCli.add(client);
		
		CompteEpargne ce = new CompteEpargne(numeroCompt, new Date(), solde, taux);
		CompteCourant cc = new CompteCourant(numeroCompt, new Date(), solde, taux);
		
		
		if (typeCompte.equalsIgnoreCase("CompteEpargne")) {
			ce.setClient(client);
			
			serviceCompte.ajoutCompte(ce, 1L);
			
			
		
			
		} else {
			cc.setClient(client);
			serviceCompte.add(cc);
			serviceCompte.ajoutCompte(cc, 1L);

		}
		request.setAttribute("listeCompte", serviceCompte.getAll());
		RequestDispatcher rd = request.getRequestDispatcher("admin/compte.jsp");
		rd.forward(request, response);
	}

}
