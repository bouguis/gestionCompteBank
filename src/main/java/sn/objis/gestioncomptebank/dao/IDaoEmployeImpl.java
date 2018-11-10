package sn.objis.gestioncomptebank.dao;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Employe;

public class IDaoEmployeImpl extends AbstractGeneriqueIDaoImpl<Employe, Long> implements IDaoEmploye {

	public IDaoEmployeImpl() {
		super(Employe.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Employe> employeByGroup(long codeGrp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmpToGrp(long codeEmp, long codeGrp) {
		// TODO Auto-generated method stub
		
	}

}
