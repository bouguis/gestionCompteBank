/**
 * 
 */
package sn.objis.gestioncomptebank.service;

import java.util.List;


import sn.objis.gestioncomptebank.dao.IDaoClientImpl;
import sn.objis.gestioncomptebank.domaine.Client;

/**
 * @author diawara
 *
 */
public class IServiceClientImpl implements IServiceClient {
	
	 IDaoClientImpl dao = new IDaoClientImpl();

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#add(java.lang.Object)
	 */
	@Override
	public Client add(Client t) {
		dao.add(t);
		return t ;
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#modify(java.lang.Object)
	 */
	@Override
	public Client modify(Client t) {
		dao.modify(t);
		return t;
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Client t) {
		dao.delete(t);

	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#getById(java.lang.Object)
	 */
	@Override
	public Client getById(Long id) {
		
		return dao.getById(id);
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#getAll()
	 */
	@Override
	public List<Client> getAll() {
		
		return dao.getAll();
	}

}
