/**
 * 
 */
package sn.objis.gestioncomptebank.service;

import sn.objis.gestioncomptebank.domaine.Employe;

/**
 * @author diawara
 *
 */
public interface IServiceEmploye extends IService<Employe> {
	public Employe addEmpl(Employe t,Long codeSup);

}
