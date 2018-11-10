package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Retrait
 *
 */
@Entity
@DiscriminatorValue("R")

public class Retrait extends Operation implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Retrait() {
		super();
	}

	public Retrait(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}
	
	
   
}
