package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CompteCourant
 *
 */
@Entity
@DiscriminatorValue("CC")

public class CompteCourant extends Compte implements Serializable {

	
	private static final long serialVersionUID = 1L;
   
	private Double decouvert;

	public CompteCourant() {
		super();
	}

	public Double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant(String numCompte, Date dateCreation, double solde, double decouvert) {
		super(numCompte, dateCreation, solde);
		this.decouvert = decouvert;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CompteCourant";
	}

	
	
	
	
	
}
