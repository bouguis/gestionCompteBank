package sn.objis.gestioncomptebank.dao;

import java.util.List;
import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.domaine.Operation;

public class IDaoOperationImpl extends AbstractGeneriqueIDaoImpl<Operation, Long> implements IDaoOperation{
	
	IDaoCompteImpl comptDao = null;

	public IDaoOperationImpl() {
		super(Operation.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Operation> operationByCompte(long codeCompte) {
		List<Operation> operations = null;
		Compte cmpt = em.find(Compte.class, codeCompte);
		operations = cmpt.getOperations();
		return operations;
	}

	@Override
	public Operation addOperation(Operation op, String numcmpt, long codeEmp) {
		Compte cmpt = comptDao.consulterCompte(numcmpt);
		Employe emp = em.find(Employe.class, codeEmp);
		op.setCmpt(cmpt);
		op.setEmploye(emp);
		em.persist(op);
		return op;
	}


}
