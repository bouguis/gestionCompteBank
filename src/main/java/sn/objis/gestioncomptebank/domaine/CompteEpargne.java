package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CompteEpargne
 *
 */
@Entity
@DiscriminatorValue("CE")

public class CompteEpargne extends Compte implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private double taux;
	
	public CompteEpargne() {
		super();
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public CompteEpargne(String numCompte, Date dateCreation, double solde, double taux) {
		super(numCompte, dateCreation, solde);
		this.taux = taux;
	}
	
	
   
}
