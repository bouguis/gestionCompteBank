/**
 * 
 */
package sn.objis.gestioncomptebank.service;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Employe;

/**
 * @author diawara
 *
 */
public interface IServiceEmploye extends IService<Employe> {
	

	public List<Employe> employeByGroup(long codeGrp);
	
	public void addEmpToGrp(long codeEmp, long codeGrp);
	
	public Employe addEmpl(Employe t,Long codeSup);
	public List<Employe> findAll();
	


}
