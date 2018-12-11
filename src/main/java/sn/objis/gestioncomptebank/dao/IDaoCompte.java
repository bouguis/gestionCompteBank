package sn.objis.gestioncomptebank.dao;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Employe;
import sn.objis.gestioncomptebank.domaine.Operation;

public interface IDaoCompte extends IDao<Compte, Long>{
	
	public List<Compte> compteByClient(long codeClient);
	
	public Compte addCompte(Compte cmpt, long codeEmploye);
	
	public Compte consulterCompte(String numCompte);
	public List<Operation> consulterOperation(String numCompte);
	
	
	
	

}
