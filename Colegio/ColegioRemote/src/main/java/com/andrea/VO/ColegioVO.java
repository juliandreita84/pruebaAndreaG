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
public class ColegioVO {

    private static final long serialVersionUID = 7296994853749358L;
    private final static Logger log = Logger.getLogger(ColegioVO.class.getName());
    private Integer idcolegio;
    private String nombrecolegio;
    private List<CursoVO> cursoList;

    public Integer getIdcolegio() {
        return idcolegio;
    }

    public void setIdcolegio(Integer idcolegio) {
        this.idcolegio = idcolegio;
    }

    public String getNombrecolegio() {
        return nombrecolegio;
    }

    public void setNombrecolegio(String nombrecolegio) {
        this.nombrecolegio = nombrecolegio;
    }

    public List<CursoVO> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<CursoVO> cursoList) {
        this.cursoList = cursoList;
    }

    @JsonCreator
    public static ColegioVO Create(String jsonString) {
        ColegioVO colegioVO = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            colegioVO = mapper.readValue(jsonString, ColegioVO.class);
        } catch (IOException ex) {
            log.log(Level.SEVERE, "Error", ex);
        } finally {
            return colegioVO;
        }
    }
    
}
