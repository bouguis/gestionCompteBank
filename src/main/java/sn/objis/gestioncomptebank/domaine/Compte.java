package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity
@Inheritance
@DiscriminatorColumn(name="TYPE_COMPTE",
discriminatorType=DiscriminatorType.STRING, length=4)

public abstract class Compte implements Serializable {

	
	private static final long serialVersionUID = 1L;

   @Id
   @Column(unique=true)
	private String numCompte;
	private Date dateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name="CODE_CLIENT")
	private Client client;
	@ManyToOne
	@JoinColumn(name="CODE_EMPLOYE")
	private Employe employe;
	@OneToMany(mappedBy="compte")
	private List<Operation> operations;

	public Compte() {
		super();
	}

	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public Compte(String numCompte, Date dateCreation, double solde) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}

	
	
	
}
