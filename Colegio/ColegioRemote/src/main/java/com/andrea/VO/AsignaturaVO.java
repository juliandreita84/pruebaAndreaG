/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.VO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrea
 */
public class AsignaturaVO {

    private static final long serialVersionUID = 7296994853749358L;
    private final static Logger log = Logger.getLogger(AsignaturaVO.class.getName());
    private Integer idasignatura;
    private String nombreasignatura;
    private List<EstudianteVO> estudianteList;
    private CursoVO idcurso;
    private ProfesorVO idprofesor;

    public Integer getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Integer idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getNombreasignatura() {
        return nombreasignatura;
    }

    public void setNombreasignatura(String nombreasignatura) {
        this.nombreasignatura = nombreasignatura;
    }

    public List<EstudianteVO> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(List<EstudianteVO> estudianteList) {
        this.estudianteList = estudianteList;
    }

    public CursoVO getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(CursoVO idcurso) {
        this.idcurso = idcurso;
    }

    public ProfesorVO getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(ProfesorVO idprofesor) {
        this.idprofesor = idprofesor;
    }

    @JsonCreator
    public static AsignaturaVO Create(String jsonString) {
        AsignaturaVO asignaturaVO = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            asignaturaVO = mapper.readValue(jsonString, AsignaturaVO.class);
        } catch (IOException ex) {
            log.log(Level.SEVERE, "Error", ex);
        } finally {
            return asignaturaVO;
        }
    }
    
}
