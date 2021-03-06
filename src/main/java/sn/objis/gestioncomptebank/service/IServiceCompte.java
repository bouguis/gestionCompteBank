package sn.objis.gestioncomptebank.service;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Compte;
import sn.objis.gestioncomptebank.domaine.Operation;

public interface IServiceCompte extends IService<Compte>{
	
	public List<Compte> compteByClient(long codeClient);
	public Compte ajoutCompte(Compte cmpt,  long codeEmploye);
	public Compte consulterCompte(String numCompte);
	public List<Operation> consulterOperation(String numCompte);
	
}
