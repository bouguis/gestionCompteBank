package sn.objis.gestioncomptebank.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.domaine.Groupe;

public class IDaoEmployeImpl extends AbstractGeneriqueIDaoImpl<Employe, Long> implements IDaoEmploye {
    EntityTransaction tx = em.getTransaction();
	public IDaoEmployeImpl() {
		super(Employe.class);  
		
	}

	@Override
	public List<Employe> employeByGroup(long codeGrp) {
		List<Employe> listeEmpToGroupe = new ArrayList<>() ;
		tx.begin();
		String jpql ="SELECT e FROM Employe e join fetch e.groupes g where g.numGroupe=:x";
		Query query =em.createQuery(jpql);
		query.setParameter("x", codeGrp);
		listeEmpToGroupe =(List<Employe>) query.getResultList();
		tx.commit();
		return listeEmpToGroupe ;

	}

	@Override
	public void addEmpToGrp(long codeEmp, long codeGrp) {
		try {
			tx.begin();
			Employe e = em.find(Employe.class, codeEmp);
			Groupe g = em.find(Groupe.class, codeGrp);
			
			e.getGroupes().add(g);
			g.getEmployes().add(e);
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Employe addEmpl(Employe t, Long codeSup) {
		
		try {
			if (codeSup!=null) {
				Employe sup = em.find(Employe.class, codeSup);
				t.setEmployeSup(sup);
			}
			tx.begin();
			em.persist(t);
			tx.commit();
			System.out.println("Persistence réuissie !");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreure Persistence !");
		}
	
		return t;
	}

	@Override
	public List<Employe> findAll() {
		List<Employe>listeElements = null;
		try {
			//Etape 1 : ouverture de la transaction
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			//Etape 2 : Traitement
			String jpql ="SELECT e FROM Employe e";
			TypedQuery<Employe> tq = em.createQuery(jpql,Employe.class);
			listeElements = tq.getResultList();
			
			//Etape 3 :Validation de la transaction
			tx.commit();
			System.out.println("liste Trouvé !");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur liste !");
		}
		return listeElements;
	}

	
	

	
		
	}


