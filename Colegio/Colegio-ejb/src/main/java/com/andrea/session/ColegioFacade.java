/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.session;

import com.andrea.entities.Colegio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andrea
 */
@Stateless
public class ColegioFacade extends AbstractColegioFacade<Colegio> implements ColegioFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Colegio-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ColegioFacade() {
        super(Colegio.class);
    }
    
}
