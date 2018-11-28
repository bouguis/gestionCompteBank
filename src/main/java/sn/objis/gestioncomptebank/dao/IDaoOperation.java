package sn.objis.gestioncomptebank.dao;

import java.util.List;
import sn.objis.gestioncomptebank.domaine.Operation;

public interface IDaoOperation extends IDao<Operation, Long> {
	
	public Operation addOperation(Operation op, String numcmpt, long codeEmp);
	
	public List<Operation> operationByCompte(long codeCompte);

}
