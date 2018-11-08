package sn.objis.gestioncomptebank.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<T,K extends Serializable> {
	
	public T add (T t);
	
	public T modify (T t);
	
	public void delete (T t);
	
	public T getById(K id);
	
	public List<T> getAll();

}
