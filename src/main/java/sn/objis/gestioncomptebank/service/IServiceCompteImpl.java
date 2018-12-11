package sn.objis.gestioncomptebank.service;

import java.util.List;

import sn.objis.gestioncomptebank.dao.IDaoCompteImpl;
import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Operation;


public class IServiceCompteImpl implements IServiceCompte{
	
	IDaoCompteImpl dao = new IDaoCompteImpl();

	@Override
	public Compte add(Compte t) {
		dao.add(t);
		return t;
	}

	@Override
	public Compte modify(Compte t) {
		dao.modify(t);
		return t;
	}

	@Override
	public void delete(Compte t) {
		dao.delete(t);
		
	}

	@Override
	public Compte getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public List<Compte> getAll() {
		
		return dao.getAll();
	}

	@Override
	public List<Compte> compteByClient(long codeClient) {
		
		return dao.compteByClient(codeClient);
	}

	

	@Override
	public Compte ajoutCompte(Compte cmpt, long codeEmploye) {
		
		return dao.addCompte(cmpt,  codeEmploye);
	}

	@Override
	public Compte consulterCompte(String numCompte) {
		
		return dao.consulterCompte(numCompte);
	}

	@Override
	public List<Operation> consulterOperation(String numCompte) {
		
		return dao.consulterOperation(numCompte);
	}

}
