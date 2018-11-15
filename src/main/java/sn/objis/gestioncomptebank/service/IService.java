/**
 * 
 */
package sn.objis.gestioncomptebank.service;

import java.util.List;

/**
 * @author diawara
 *
 */
public interface IService<T> {
	public T add(T t);

	public T modify(T t);

	public void delete(T t);

	public T getById(Long id);

	public List<T> getAll();

}
