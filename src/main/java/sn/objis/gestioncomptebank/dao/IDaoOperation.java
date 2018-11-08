package sn.objis.gestioncomptebank.dao;

import java.util.List;
import sn.objis.gestioncomptebank.domaine.Operation;
import sn.objis.gestioncomptebank.domaine.Retrait;
import sn.objis.gestioncomptebank.domaine.Versement;

public interface IDaoOperation extends IDao<Operation, Long> {
	
	public void retirer(Retrait retrait);
	
	public void versement(Versement versement);
	
	public void virement(Retrait retrait, Versement versement);
	
	public List<Operation> operationByCompte(long codeCompte);

}
