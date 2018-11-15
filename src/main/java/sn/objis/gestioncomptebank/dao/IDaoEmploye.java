package sn.objis.gestioncomptebank.dao;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Employe;

public interface IDaoEmploye extends IDao<Employe, Long> {
	
	public List<Employe> employeByGroup(long codeGrp);
	
	public void addEmpToGrp(long codeEmp, long codeGrp);
	public Employe addEmpl(Employe t,Long codeSup);
	

}
