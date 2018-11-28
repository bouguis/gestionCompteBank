/**
 * 
 */
package sn.objis.gestioncomptebank.service;

import java.util.List;

import sn.objis.gestioncomptebank.dao.IDaoEmployeImpl;
import sn.objis.gestioncomptebank.domaine.Employe;

/**
 * @author diawara
 *
 */
public class IServiceEmployeImpl implements IServiceEmploye {
	
	private IDaoEmployeImpl dao = new IDaoEmployeImpl();

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#add(java.lang.Object)
	 */
	@Override
	public Employe add(Employe t) {
		
		return dao.add(t);
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#modify(java.lang.Object)
	 */
	@Override
	public Employe modify(Employe t) {
		dao.modify(t);
		return t;
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Employe t) {
		dao.delete(t);

	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#getById(java.lang.Long)
	 */
	@Override
	public Employe getById(Long id) {
		
		return dao.getById(id);
	}

	/* (non-Javadoc)
	 * @see sn.objis.gestioncomptebank.service.IService#getAll()
	 */
	@Override
	public List<Employe> getAll() {
	
		return dao.getAll();
	}

	@Override
	public Employe addEmpl(Employe t, Long codeSup) {
		dao.addEmpl(t, codeSup);
		return t;
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();

	}

	@Override
	public void addEmpToGrp(long codeEmp, long codeGrp) {
		dao.addEmpToGrp(codeEmp, codeGrp);
		
	}


	@Override
	public List<Employe> employeByGroup(long codeGrp) {
		
		return dao.employeByGroup(codeGrp);
	}


}
