/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.negocio;

import com.andrea.VO.AsignaturaVO;
import com.andrea.VO.EstudianteVO;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Andrea
 */
@Remote
public interface ColegioBeanRemote 
{

    public List<AsignaturaVO> buscarAsignaturasProfesor (Integer idProfesor);

    public List<EstudianteVO> buscarEstudiantesAsignatura(Integer idAsignatura);
    
}
