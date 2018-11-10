package sn.objis.gestioncomptebank.dao;

import java.util.List;

import sn.objis.gestioncomptebank.domaine.Compte;

public class IDaoCompteImpl extends AbstractGeneriqueIDaoImpl<Compte, Long> implements IDaoCompte {

	public IDaoCompteImpl() {
		super(Compte.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Compte> compteByClient(long codeClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> compteByEmp(long codeEmp) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
