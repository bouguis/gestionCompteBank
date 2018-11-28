package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Groupe
 *
 */
@Entity

public class Groupe implements Serializable {

	
	private static final long serialVersionUID = 1L;
   
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long numGroupe;
	private String nomGroupe;
	@ManyToMany(mappedBy="groupes")
	private List<Employe> employes;

	public Groupe() {
		super();
	}

	public long getNumGroupe() {
		return numGroupe;
	}
	public void setNumGroupe(long numGroupe) {
		this.numGroupe = numGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	public Groupe( String nomGroupe) {
		super();
		this.nomGroupe = nomGroupe;
	}
	
	
}
