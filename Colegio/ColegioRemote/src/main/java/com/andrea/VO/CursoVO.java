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
public class CursoVO {
    
    private static final long serialVersionUID = 7296994853749358L;
    private final static Logger log = Logger.getLogger(CursoVO.class.getName());
    private Integer idcurso;
    private Integer grado;
    private String salon;
    private ColegioVO idcolegio;
    private List<AsignaturaVO> asignaturaList;

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public ColegioVO getIdcolegio() {
        return idcolegio;
    }

    public void setIdcolegio(ColegioVO idcolegio) {
        this.idcolegio = idcolegio;
    }

    public List<AsignaturaVO> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(List<AsignaturaVO> asignaturaList) {
        this.asignaturaList = asignaturaList;
    }

    @JsonCreator
    public static CursoVO Create(String jsonString) {
        CursoVO cursoVO = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            cursoVO = mapper.readValue(jsonString, CursoVO.class);
        } catch (IOException ex) {
            log.log(Level.SEVERE, "Error", ex);
        } finally {
            return cursoVO;
        }
    }
    
}
