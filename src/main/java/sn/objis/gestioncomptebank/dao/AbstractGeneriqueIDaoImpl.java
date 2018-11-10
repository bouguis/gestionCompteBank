package sn.objis.gestioncomptebank.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public abstract class AbstractGeneriqueIDaoImpl <E,P extends Serializable> implements IDao<E, P>{
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("bank");
	protected EntityManager em = emf.createEntityManager();
	private Class<E> typeEntite;
	
	public AbstractGeneriqueIDaoImpl(Class<E> typeEntite) {
		super();
		this.typeEntite = typeEntite;
	}

	@Override
	public E add(E t) {
		em.persist(t);
		return t;
	}

	@Override
	public E modify(E t) {
		em.merge(t);
		return t;
	}

	@Override
	public void delete(E t) {
		if (em.contains(t)) {
			em.remove(t);
		}else {
			em.remove(em.merge(t));
		
		}
		
	}

	@Override
	public E getById(P id) {
		E elementFinded = null;
		
		elementFinded = em.find(typeEntite, id);
		
		
		return elementFinded;
	}

	@Override
	public List<E> getAll() {
			List<E> listeElements = null;
			
			String jpql = "SELECT e FROM E e";
			
			TypedQuery<E> tq = em.createQuery(jpql, typeEntite);
			
			listeElements = tq.getResultList();
	
		return listeElements;
	}
	
	
	

}
