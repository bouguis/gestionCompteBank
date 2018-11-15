package sn.objis.gestioncomptebank.dao;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.domaine.Groupe;

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
		Employe e = em.find(Employe.class, codeEmp);
		Groupe g = em.find(Groupe.class, codeGrp);
		e.getGroupes().add(g);
		g.getEmployes().add(e);
		
	}

	@Override
	public Employe addEmpl(Employe t, Long codeSup) {
		if (codeSup!=null) {
			Employe sup = em.find(Employe.class, codeSup);
			t.setEmployeSup(sup);
		}
		em.persist(t);
	
		return t;
	}

	
	

}
