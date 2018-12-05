package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codeClient;
	private String nom;
	private String adresse;
	@OneToMany(mappedBy="client")
	private List<Compte> comptes;

	public Client() {
		super();
	}
	

	public Client(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}


	public long getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(long codeClient) {
		this.codeClient = codeClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
   
	
}
