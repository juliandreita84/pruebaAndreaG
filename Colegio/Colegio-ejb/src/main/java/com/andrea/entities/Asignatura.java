/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andrea
 */
@Entity
@Table(name = "ASIGNATURA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignatura.findAll", query = "SELECT a FROM Asignatura a")
    , @NamedQuery(name = "Asignatura.findByIdasignatura", query = "SELECT a FROM Asignatura a WHERE a.idasignatura = :idasignatura")
    , @NamedQuery(name = "Asignatura.findByNombreasignatura", query = "SELECT a FROM Asignatura a WHERE a.nombreasignatura = :nombreasignatura")})
public class Asignatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDASIGNATURA")
    private Integer idasignatura;
    @Size(max = 255)
    @Column(name = "NOMBREASIGNATURA")
    private String nombreasignatura;
    @JoinTable(name = "ASIGNATURAESTUDIANTE", joinColumns = {
        @JoinColumn(name = "IDASIGNATURA", referencedColumnName = "IDASIGNATURA")}, inverseJoinColumns = {
        @JoinColumn(name = "IDESTUDIANTE", referencedColumnName = "IDESTUDIANTE")})
    @ManyToMany
    private List<Estudiante> estudianteList;
    @JoinColumn(name = "IDCURSO", referencedColumnName = "IDCURSO")
    @ManyToOne(optional = false)
    private Curso idcurso;
    @JoinColumn(name = "IDPROFESOR", referencedColumnName = "IDPROFESOR")
    @ManyToOne
    private Profesor idprofesor;

    public Asignatura() {
    }

    public Asignatura(Integer idasignatura) {
        this.idasignatura = idasignatura;
    }

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

    @XmlTransient
    public List<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(List<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }

    public Curso getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Curso idcurso) {
        this.idcurso = idcurso;
    }

    public Profesor getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(Profesor idprofesor) {
        this.idprofesor = idprofesor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idasignatura != null ? idasignatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignatura)) {
            return false;
        }
        Asignatura other = (Asignatura) object;
        if ((this.idasignatura == null && other.idasignatura != null) || (this.idasignatura != null && !this.idasignatura.equals(other.idasignatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.andrea.entities.Asignatura[ idasignatura=" + idasignatura + " ]";
    }
    
}
