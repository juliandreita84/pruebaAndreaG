/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.negocio;

import com.andrea.VO.AsignaturaVO;
import com.andrea.VO.EstudianteVO;
import com.andrea.entities.Asignatura;
import com.andrea.entities.Estudiante;
import com.andrea.session.AsignaturaFacadeLocal;
import com.andrea.session.EstudianteFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Andrea
 */
@Stateless
public class ColegioBean implements ColegioBeanLocal, ColegioBeanRemote {

    private static final Logger log = Logger.getLogger(ColegioBean.class.getName());

    @EJB
    private AsignaturaFacadeLocal asignaturaDAO;
    @EJB
    private EstudianteFacadeLocal estudianteDAO;

    @Override
    public List<AsignaturaVO> buscarAsignaturasProfesor(Integer idProfesor) {
        List<AsignaturaVO> AsignaturaVOs = null;
        try {
            List<Asignatura> asignaturas = asignaturaDAO.findAll();

            if (asignaturas != null && !asignaturas.isEmpty()) {
                AsignaturaVOs = new ArrayList<>();
                for (Asignatura a : asignaturas) {
                    if (a.getIdprofesor().getIdprofesor().equals(idProfesor)) {
                        AsignaturaVO avo = new AsignaturaVO();
                        avo.setIdasignatura(a.getIdasignatura());
                        avo.setNombreasignatura(a.getNombreasignatura());
                        AsignaturaVOs.add(avo);
                    }
                }
            }

        } catch (Exception e) {
            log.log(Level.SEVERE, "Error al obtener las asignaturas por profesor", e);
        } finally {
            return AsignaturaVOs;
        }
    }

    @Override
    public List<EstudianteVO> buscarEstudiantesAsignatura(Integer idAsignatura) {
        List<EstudianteVO> EstudianteVOs = null;

        try {
            Asignatura asignatura = asignaturaDAO.obtenerAsignaturaPorID(idAsignatura);
            if (asignatura != null) {
                if (asignatura.getEstudianteList() != null && asignatura.getEstudianteList().isEmpty()) {
                    for (Estudiante e : asignatura.getEstudianteList()) {
                        EstudianteVO evo = new EstudianteVO();
                        evo.setIdestudiante(e.getIdestudiante());
                        evo.setNombreestudiante(e.getNombreestudiante());
                        EstudianteVOs.add(evo);
                    }
                }
            }

        } catch (Exception e) {
            log.log(Level.SEVERE, "Error al obtener los estudiantes por asignatura", e);
        } finally {
            return EstudianteVOs;
        }
    }
}
