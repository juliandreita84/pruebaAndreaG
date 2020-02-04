/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.session;

import com.andrea.entities.Asignatura;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andrea
 */
@Stateless
public class AsignaturaFacade extends AbstractColegioFacade<Asignatura> implements AsignaturaFacadeLocal {

    private final Logger log = Logger.getLogger(AsignaturaFacade.class.getName());
    
    @PersistenceContext(unitName = "com.mycompany_Colegio-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsignaturaFacade() {
        super(Asignatura.class);
    }

    @Override
    public Asignatura obtenerAsignaturaPorID(Integer idAsignatura) {
        Asignatura a = null;
        try {
            Query q = em.createNamedQuery("Asignatura.findByIdasignatura");
            q.setParameter("idasignatura", idAsignatura);
            a = (Asignatura) q.getSingleResult();
        } catch (Exception e) {
            log.log(Level.OFF, null, em);
        } finally {
            return a;
        }
    }
    
}
