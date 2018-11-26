package sn.objis.gestioncomptebank.service;

import java.util.Date;
import java.util.List;

import sn.objis.gestioncomptebank.dao.IDaoCompteImpl;
import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.CompteCourant;
import sn.objis.gestioncomptebank.domaine.CompteEpargne;

public class IServiceCompteImpl implements IServiceCompte{
	
	IDaoCompteImpl dao = null;

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
	public void addCompteCourant(String numCompte,Date dateCreation, double solde, double decouvert, long codeClient, long codeEmploye) {
		dao.addCompte(new CompteCourant(numCompte, dateCreation, solde, decouvert), codeClient, codeEmploye);
	}

	@Override
	public void addCompteEpargne(String numCompte, Date dateCreation, double solde, double taux, long codeClient,
			long codeEmploye) {
		dao.addCompte(new CompteEpargne(numCompte, dateCreation, solde, taux), codeClient, codeEmploye);
		
	}

}
