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
public class EstudianteVO {
    
    private static final long serialVersionUID = 7296994853749358L;
    private final static Logger log = Logger.getLogger(EstudianteVO.class.getName());
    private Integer idestudiante;
    private String nombreestudiante;
    private List<AsignaturaVO> asignaturaList;

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombreestudiante() {
        return nombreestudiante;
    }

    public void setNombreestudiante(String nombreestudiante) {
        this.nombreestudiante = nombreestudiante;
    }

    public List<AsignaturaVO> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(List<AsignaturaVO> asignaturaList) {
        this.asignaturaList = asignaturaList;
    }

    @JsonCreator
    public static EstudianteVO Create(String jsonString) {
        EstudianteVO estudianteVO = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            estudianteVO = mapper.readValue(jsonString, EstudianteVO.class);
        } catch (IOException ex) {
            log.log(Level.SEVERE, "Error", ex);
        } finally {
            return estudianteVO;
        }
    }
    
}
