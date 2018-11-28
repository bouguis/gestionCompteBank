package sn.objis.gestioncomptebank.dao;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Compte;

public interface IDaoCompte extends IDao<Compte, Long>{
	
	public List<Compte> compteByClient(long codeClient);
	
	public Compte addCompte(Compte cmpt, long codeClient, long codeEmploye);
	
	public Compte consulterCompte(String numCompte);
	
	

}
