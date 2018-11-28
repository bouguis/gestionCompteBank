package sn.objis.gestioncomptebank.service;

import java.util.Date;
import java.util.List;

import sn.objis.gestioncomptebank.domaine.Compte;

public interface IServiceCompte extends IService<Compte>{
	
	public List<Compte> compteByClient(long codeClient);
	
	public void addCompteCourant(String numCompte,Date dateCreation, double solde, double decouvert, long codeClient, long codeEmploye);
	
	public void addCompteEpargne(String numCompte,Date dateCreation, double solde, double taux, long codeClient, long codeEmploye);

}
