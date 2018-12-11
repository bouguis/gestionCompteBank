package sn.objis.gestioncomptebank.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.domaine.Operation;

public class IDaoOperationImpl extends AbstractGeneriqueIDaoImpl<Operation, Long> implements IDaoOperation{
	
	IDaoCompteImpl comptDao = new IDaoCompteImpl();
	EntityTransaction tx = em.getTransaction();

	public IDaoOperationImpl() {
		super(Operation.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Operation> operationByCompte(long codeCompte) {
		List<Operation> operations =null;
		try {
			operations = null;
			Compte cmpt = em.find(Compte.class, codeCompte);
			operations = cmpt.getOperations();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return operations;
	}

	@Override
	public Operation addOperation(Operation op, String numcmpt, long codeEmp) {
		
		try {
			Compte cmpt = comptDao.consulterCompte(numcmpt);
			tx.begin();
			Employe emp = em.find(Employe.class, codeEmp);
			op.setCmpt(cmpt);
			op.setEmploye(emp);
			em.persist(op);
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return op;
	}


}
