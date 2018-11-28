package sn.objis.gestioncomptebank.service;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Operation;

public interface IServiceOperation extends IService<Operation>{
	public List<Operation> operationByCompte(long codeCompte);
	public void verser(double montant, String numCompte, long codeEmp);
	public void retrait(double montant, String numCompte, long codeEmp);
	public void virement(double montant, String numCompte1, String numCompte2, long codeEmp);

}
