package sn.objis.gestioncomptebank.dao;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Client;
import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Employe;

public class IDaoCompteImpl extends AbstractGeneriqueIDaoImpl<Compte, Long> implements IDaoCompte {

	public IDaoCompteImpl() {
		super(Compte.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Compte> compteByClient(long codeClient) {
		List<Compte> comptes = null;
		Client client = em.find(Client.class, codeClient);
		comptes = client.getComptes();
		return comptes;
	}

	@Override
	public Compte addCompte(Compte cmpt, long codeClient, long codeEmploye) {
		Client client = em.find(Client.class, codeClient);
		Employe emp = em.find(Employe.class, codeEmploye);
		cmpt.setClient(client);
		cmpt.setEmploye(emp);
		em.persist(cmpt);
		return cmpt;
	}

	@Override
	public Compte consulterCompte(String numCompte) {
		Compte cmpt = em.find(Compte.class, numCompte);
		return cmpt;
	}

	
	

}
