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
public class ProfesorVO {

    private static final long serialVersionUID = 7296994853749358L;
    private final static Logger log = Logger.getLogger(ProfesorVO.class.getName());
    private Integer idprofesor;
    private String nombreprofesor;
    private List<AsignaturaVO> asignaturaList;

    public Integer getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(Integer idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getNombreprofesor() {
        return nombreprofesor;
    }

    public void setNombreprofesor(String nombreprofesor) {
        this.nombreprofesor = nombreprofesor;
    }

    public List<AsignaturaVO> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(List<AsignaturaVO> asignaturaList) {
        this.asignaturaList = asignaturaList;
    }

    @JsonCreator
    public static ProfesorVO Create(String jsonString) {
        ProfesorVO profesorVO = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            profesorVO = mapper.readValue(jsonString, ProfesorVO.class);
        } catch (IOException ex) {
            log.log(Level.SEVERE, "Error", ex);
        } finally {
            return profesorVO;
        }
    }
    
}
