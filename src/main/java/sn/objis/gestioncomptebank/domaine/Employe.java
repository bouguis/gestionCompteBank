package sn.objis.gestioncomptebank.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employe
 *
 */
@Entity

public class Employe implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codeEmploye;
	private String nomEmloye;
	@ManyToOne
	@JoinColumn(name="CODE_EMP_SUP")
	private Employe employeSup;
	@ManyToMany
	@JoinTable(name="EMP_GRP",joinColumns=
	@JoinColumn(name="CODE_EMP"),
	inverseJoinColumns=@JoinColumn(name="CODE_GRP"))
	private List<Groupe> groupes;
	
	public Employe() {
		super();
	}
	
	public long getCodeEmploye() {
		return codeEmploye;
	}
	public void setCodeEmploye(long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}
	public String getNomEmloye() {
		return nomEmloye;
	}
	public void setNomEmloye(String nomEmloye) {
		this.nomEmloye = nomEmloye;
	}
	public Employe getEmployeSup() {
		return employeSup;
	}
	public void setEmployeSup(Employe employeSup) {
		this.employeSup = employeSup;
	}
	public List<Groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
	public Employe(long codeEmploye, String nomEmloye) {
		super();
		this.codeEmploye = codeEmploye;
		this.nomEmloye = nomEmloye;
	}
	
	
   
}
