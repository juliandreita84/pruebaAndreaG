package com.andrea.entities;

import com.andrea.entities.Curso;
import com.andrea.entities.Estudiante;
import com.andrea.entities.Profesor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-03T22:18:36")
@StaticMetamodel(Asignatura.class)
public class Asignatura_ { 

    public static volatile SingularAttribute<Asignatura, String> nombreasignatura;
    public static volatile ListAttribute<Asignatura, Estudiante> estudianteList;
    public static volatile SingularAttribute<Asignatura, Integer> idasignatura;
    public static volatile SingularAttribute<Asignatura, Curso> idcurso;
    public static volatile SingularAttribute<Asignatura, Profesor> idprofesor;

}