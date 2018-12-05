package sn.objis.gestioncomptebank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import sn.objis.gestioncomptebank.domaine.Client;
import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Employe;

public class IDaoCompteImpl extends AbstractGeneriqueIDaoImpl<Compte, Long> implements IDaoCompte {
	
	EntityTransaction tx = em.getTransaction();
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
	public Compte addCompte(Compte cmpt,  long codeEmploye) {
		tx.begin();
		
		Employe emp = em.find(Employe.class, codeEmploye);
		
		cmpt.setEmploye(emp);
		em.persist(cmpt);
		tx.commit();
		return cmpt;
	}

	@Override
	public Compte consulterCompte(String numCompte) {
		tx.begin();
		Compte cmpt = em.find(Compte.class, numCompte);
		tx.commit();
		if (cmpt==null) {
			throw new RuntimeException("Compte introuvable");
		}
		
		return cmpt;
	}

	
	

	

	

	
	

}
