/**
 * 
 */
package sn.objis.gestioncomptebank.service;

import java.util.List;

import sn.objis.gestioncomptebank.dao.IDaoGroupeImpl;
import sn.objis.gestioncomptebank.domaine.Groupe;

/**
 * @author diawara
 *
 */
public class IServiceGroupImpl implements IServiceGroup {
	private IDaoGroupeImpl dao = new IDaoGroupeImpl();

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#add(java.lang.Object)
	 */
	@Override
	public Groupe add(Groupe t) {
		dao.add(t);
		return t;
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#modify(java.lang.Object)
	 */
	@Override
	public Groupe modify(Groupe t) {
		dao.modify(t);
		return t;
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Groupe t) {
		dao.delete(t);

	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#getById(java.lang.Long)
	 */
	@Override
	public Groupe getById(Long id) {
		
		return dao.getById(id);
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#getAll()
	 */
	@Override
	public List<Groupe> getAll() {
		
		return dao.getAll();
	}

}
