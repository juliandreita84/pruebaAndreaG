package com.andrea.entities;

import com.andrea.entities.Curso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-03T22:18:36")
@StaticMetamodel(Colegio.class)
public class Colegio_ { 

    public static volatile SingularAttribute<Colegio, Integer> idcolegio;
    public static volatile SingularAttribute<Colegio, String> nombrecolegio;
    public static volatile ListAttribute<Colegio, Curso> cursoList;

}