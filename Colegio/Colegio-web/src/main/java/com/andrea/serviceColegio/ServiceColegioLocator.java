/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.serviceColegio;

import com.andrea.negocio.ColegioBeanRemote;
import com.andrea.util.PropertiesReader;
import java.io.Serializable;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Andrea
 */
public class ServiceColegioLocator implements Serializable {

    private static final long serialVersionUID = -5247944869980257854L;

    private Context contexto;
    private final Properties props = new Properties();

    public ServiceColegioLocator() {
        props.put(Context.URL_PKG_PREFIXES, "org.jboss.naming.remote.client.InitialContextFactory");
        try {
            contexto = new InitialContext(props);

        } catch (NamingException ex) {
            Logger.getLogger(ServiceColegioLocator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene la instancia para la conexión con el EJB local
     *
     * @return
     */
    public ColegioBeanRemote getEJBAsignatura() {
        ColegioBeanRemote remoto = null;
        PropertiesReader pr = new PropertiesReader("com.andrea.util.recursos");
        String EJBRemoto = pr.getProperty("EJBRemotoColegio");
        try {
            remoto = (ColegioBeanRemote) contexto.lookup("java:global/" + EJBRemoto);
        } catch (NamingException e) {
            Logger.getLogger(ServiceColegioLocator.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception e) {
            Logger.getLogger(ServiceColegioLocator.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return remoto;
        }
    }
}
