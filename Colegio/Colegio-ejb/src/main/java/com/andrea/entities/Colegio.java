/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andrea.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "COLEGIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colegio.findAll", query = "SELECT c FROM Colegio c")
    , @NamedQuery(name = "Colegio.findByIdcolegio", query = "SELECT c FROM Colegio c WHERE c.idcolegio = :idcolegio")
    , @NamedQuery(name = "Colegio.findByNombrecolegio", query = "SELECT c FROM Colegio c WHERE c.nombrecolegio = :nombrecolegio")})
public class Colegio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOLEGIO")
    private Integer idcolegio;
    @Size(max = 255)
    @Column(name = "NOMBRECOLEGIO")
    private String nombrecolegio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcolegio")
    private List<Curso> cursoList;

    public Colegio() {
    }

    public Colegio(Integer idcolegio) {
        this.idcolegio = idcolegio;
    }

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

    @XmlTransient
    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcolegio != null ? idcolegio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colegio)) {
            return false;
        }
        Colegio other = (Colegio) object;
        if ((this.idcolegio == null && other.idcolegio != null) || (this.idcolegio != null && !this.idcolegio.equals(other.idcolegio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.andrea.entities.Colegio[ idcolegio=" + idcolegio + " ]";
    }
    
}
