package sn.objis.gestioncomptebank.service;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Compte;

public interface IServiceCompte extends IService<Compte>{
	
	public List<Compte> compteByClient(long codeClient);
	
	public Compte addCompte(Compte cmpt, long codeClient, long codeEmploye) ;

}
