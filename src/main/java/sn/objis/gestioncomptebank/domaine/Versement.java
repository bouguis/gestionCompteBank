package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Versement
 *
 */
@Entity
@DiscriminatorValue("v")

public class Versement extends Operation implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Versement() {
		super();
	}

	public Versement(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}
   
	
}
