package sn.objis.gestioncomptebank.dao;

import java.util.List;
import sn.objis.gestioncomptebank.domaine.Operation;
import sn.objis.gestioncomptebank.domaine.Retrait;
import sn.objis.gestioncomptebank.domaine.Versement;

public class IDaoOperationImpl extends AbstractGeneriqueIDaoImpl<Operation, Long> implements IDaoOperation{

	public IDaoOperationImpl() {
		super(Operation.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Operation> operationByCompte(long codeCompte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void retirer(Retrait retrait) {
		// TODO Auto-generated method stub
		em.persist(retrait);
	}

	@Override
	public void versement(Versement versement) {
		// TODO Auto-generated method stub
		em.persist(versement);
	}

	@Override
	public void virement(Retrait retrait, Versement versement) {
		// TODO Auto-generated method stub
		em.persist(retrait);
		em.persist(versement);
	}

	

}
