/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import beans.Laboratoire;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author machd
 */
@Stateless
public class LaboratoireFacade extends AbstractFacade<Laboratoire> {
    @PersistenceContext(unitName = "cedoc3.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LaboratoireFacade() {
        super(Laboratoire.class);
    }
    
}
