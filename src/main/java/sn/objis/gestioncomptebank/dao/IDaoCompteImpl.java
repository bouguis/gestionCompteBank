package sn.objis.gestioncomptebank.dao;


import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import sn.objis.gestioncomptebank.domaine.Client;
import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.domaine.Operation;

public class IDaoCompteImpl extends AbstractGeneriqueIDaoImpl<Compte, Long> implements IDaoCompte {
	
	EntityTransaction tx = em.getTransaction();
	public IDaoCompteImpl() {
		super(Compte.class);
		
	}

	@Override
	public List<Compte> compteByClient(long codeClient) {
		List<Compte> comptes = null;
		try {
			tx.begin();
			Client client = em.find(Client.class, codeClient);
			comptes = client.getComptes();
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comptes;
	}

	@Override
	public Compte addCompte(Compte cmpt,  long codeEmploye) {
		try {
			tx.begin();
			
			Employe emp = em.find(Employe.class, codeEmploye);
			
			cmpt.setEmploye(emp);
			em.persist(cmpt);
			tx.commit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cmpt;
		
		
	}

	@Override
	public Compte consulterCompte(String numCompte) {
		Compte cmpt =null;
		
			tx.begin();
			cmpt = em.find(Compte.class, numCompte);
			tx.commit();
			if (cmpt==null) {
				throw new RuntimeException("Compte introuvable");
			}
		
			
		
		
		return cmpt;
	}

	@Override
	public List<Operation> consulterOperation(String numCompte) {
		List<Operation>listeOperations = null;
		try {
			tx.begin();
			String jpql ="SELECT o From Operation o join fetch o.compte p WHERE p.numCompte=:x";
			Query query = em.createQuery(jpql);
			query.setParameter("x", numCompte);
			listeOperations = query.getResultList();
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listeOperations;
	}

	
	

	

	

	
	

}
