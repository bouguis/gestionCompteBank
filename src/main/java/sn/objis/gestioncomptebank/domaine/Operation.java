package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Operation
 *
 */
@Entity
@Inheritance
@DiscriminatorColumn(name="TYPE_OPERATION", discriminatorType=DiscriminatorType.STRING,length=4)

public abstract class Operation implements Serializable {

	
	public Operation(Date dateOperation, double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long numOperation;
	private Date dateOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name="CODE_EMPL")
	private Employe employe;
	private Compte cmpt;
	
	

	public Operation() {
		super();
		
	}

	public long getNumOperation() {
		return numOperation;
	}


	public void setNumOperation(long numOperation) {
		this.numOperation = numOperation;
	}


	public Date getDateOperation() {
		return dateOperation;
	}


	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public Employe getEmploye() {
		return employe;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Compte getCmpt() {
		return cmpt;
	}

	public void setCmpt(Compte cmpt) {
		this.cmpt = cmpt;
	}
	
   
}
