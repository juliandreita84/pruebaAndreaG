/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.serviciossincroniza;

import com.andrea.BO.OperarAsignatura;
import com.andrea.VO.AsignaturaVO;
import com.andrea.VO.EstudianteVO;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author Andrea
 */
@Controller
@RequestMapping("/operaciones")
public class OperacionesAsignaturas {

    /**
     * Obtiene el listado de asignaturas que tiene un profesor
     *
     * @param idProfesor
     * @return Conjunto de asignaturas
     */
    @RequestMapping(value = "/asignaturasProfesor", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public List<AsignaturaVO> buscarAsignaturasProfesor(Integer idProfesor) {
        OperarAsignatura oa = new OperarAsignatura();
        return oa.buscarAsignaturasProfesor(idProfesor);
    }
    
    /**
     * Obtiene el listado de los estudiantes inscritos a cada asignatura
     *
     * @param idAsignatura
     * @return Conjunto de estudiantes
     */
    @RequestMapping(value = "/estudiantesAsignatura", method = RequestMethod.GET, headers = "Accept=application/json", produces = {"application/json"})
    @ResponseBody
    public List<EstudianteVO> buscarEstudiantesAsignatura(Integer idAsignatura) {
        OperarAsignatura oa = new OperarAsignatura();
        return oa.buscarEstudiantesAsignatura(idAsignatura);
    }
    
}
