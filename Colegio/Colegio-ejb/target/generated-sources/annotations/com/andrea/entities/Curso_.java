package com.andrea.entities;

import com.andrea.entities.Asignatura;
import com.andrea.entities.Colegio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-03T22:18:36")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> grado;
    public static volatile SingularAttribute<Curso, Colegio> idcolegio;
    public static volatile ListAttribute<Curso, Asignatura> asignaturaList;
    public static volatile SingularAttribute<Curso, Integer> idcurso;
    public static volatile SingularAttribute<Curso, String> salon;

}