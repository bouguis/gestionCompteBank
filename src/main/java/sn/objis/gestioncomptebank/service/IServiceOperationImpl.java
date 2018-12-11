package sn.objis.gestioncomptebank.service;

import java.util.Date;
import java.util.List;

import sn.objis.gestioncomptebank.dao.IDaoCompteImpl;
import sn.objis.gestioncomptebank.dao.IDaoOperationImpl;
import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Operation;
import sn.objis.gestioncomptebank.domaine.Retrait;
import sn.objis.gestioncomptebank.domaine.Versement;

public class IServiceOperationImpl implements IServiceOperation{
	
	IDaoOperationImpl dao = new IDaoOperationImpl();
	IDaoCompteImpl daoCompte = new IDaoCompteImpl();

	@Override
	public Operation add(Operation t) {
		
		return dao.add(t);
	}

	@Override
	public Operation modify(Operation t) {
		dao.modify(t);
		return t;
	}

	@Override
	public void delete(Operation t) {
		dao.delete(t);
		
	}

	@Override
	public Operation getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public List<Operation> getAll() {
		
		return dao.getAll();
	}

	@Override
	public List<Operation> operationByCompte(long codeCompte) {
		
		return dao.operationByCompte(codeCompte);
	}

	@Override
	public void verser(double montant, String numCompte, long codeEmp) {
		dao.addOperation(new Versement(new Date(), montant), numCompte, codeEmp);
		Compte cp = daoCompte.consulterCompte(numCompte);
		cp.setSolde(cp.getSolde() + montant);
	}

	@Override
	public void retrait(double montant, String numCompte, long codeEmp) {
		dao.addOperation(new Retrait(new Date(), montant), numCompte, codeEmp);
		Compte cp = daoCompte.consulterCompte(numCompte);
		cp.setSolde(cp.getSolde() - montant);
	}

	@Override
	public void virement(double montant, String numCompte1, String numCompte2, long codeEmp) {
		retrait(montant, numCompte1, codeEmp);
		verser(montant, numCompte2, codeEmp);
		
	}

	@Override
	public Operation addOperation(Operation op, String numcmpt, long codeEmp) {
		// TODO Auto-generated method stub
		return dao.addOperation(op, numcmpt, codeEmp);
	}
	
	
	

}
