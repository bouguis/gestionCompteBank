package sn.objis.gestioncomptebank.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public abstract class AbstractGeneriqueIDaoImpl <E,P extends Serializable> implements IDao<E, P>{
	
	protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("bank");
	protected EntityManager em = emf.createEntityManager();
	private Class<E> typeEntite;
	
	public AbstractGeneriqueIDaoImpl(Class<E> typeEntite) {
		super();
		this.typeEntite = typeEntite;
	}

	@Override
	public E add(E t) {
		
			try {
				//Etape 1 : ouverture de la transaction
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				//Etape 2 : Traitement
				em.persist(t);
				//Etape 3 :Validation de la transaction
				tx.commit();
				
				System.out.println("Persistence réuissie !");
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("Erreure Persistence !");
			}
		
		return t;
	}

	@Override
	public E modify(E t) {
		em.merge(t);
		return t;
	}

	@Override
	public void delete(E t) {
		try {
			//Etape 1 : ouverture de la transaction
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			if (em.contains(t)) {
				em.remove(t);
			}else {
				em.remove(em.merge(t));
			
			}

			//Etape 3 :Validation de la transaction
			tx.commit();
			
			System.out.println("Suppresion réuissie !");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Suppresion Persistence !");
		}
		
	}

	@Override
	public E getById(P id) {
		E elementFinded = null;
		try {
			//Etape 1 : ouverture de la transaction
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			elementFinded = em.find(typeEntite, id);
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return elementFinded;
	}

	@Override
	public List<E> getAll() {
			List<E> listeElements = null;
			
			try {
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				//Etape 1 : Creation d'un Critéri Builder
				CriteriaBuilder cb = em.getCriteriaBuilder();
				//Etape 1 : Creation d'un Critéri query
				CriteriaQuery<E> cq = cb.createQuery(typeEntite);
				
				cq.select(cq.from(typeEntite));
				TypedQuery<E> query = em.createQuery(cq);
				tx.commit();
				
				listeElements = query.getResultList();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		return listeElements;
	}
	
	
	

}
