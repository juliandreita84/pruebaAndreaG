package com.andrea.entities;

import com.andrea.entities.Asignatura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-03T22:18:36")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile SingularAttribute<Profesor, String> nombreprofesor;
    public static volatile ListAttribute<Profesor, Asignatura> asignaturaList;
    public static volatile SingularAttribute<Profesor, Integer> idprofesor;

}