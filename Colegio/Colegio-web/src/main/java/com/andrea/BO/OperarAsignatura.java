/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.BO;

import com.andrea.VO.AsignaturaVO;
import com.andrea.VO.EstudianteVO;
import com.andrea.negocio.ColegioBeanRemote;
import com.andrea.serviceColegio.ServiceColegioLocator;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class OperarAsignatura implements Serializable {

    private static final long serialVersionUID = 4102485629513453586L;

    private final ServiceColegioLocator sl;
    private final ColegioBeanRemote asignaturasEJB;

    public OperarAsignatura() {

        this.sl = new ServiceColegioLocator();
        this.asignaturasEJB = this.sl.getEJBAsignatura();
    }

    public List<AsignaturaVO> buscarAsignaturasProfesor(Integer idProfesor) {
        return asignaturasEJB.buscarAsignaturasProfesor(idProfesor);
    }

    public List<EstudianteVO> buscarEstudiantesAsignatura(Integer idAsignatura) {
        return asignaturasEJB.buscarEstudiantesAsignatura(idAsignatura);
    }

}
