package javaeetutorial.dukestutoring.entity;

import javaeetutorial.dukestutoring.entity.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-02-11T11:09:30")
@StaticMetamodel(Guardian.class)
public class Guardian_ extends Person_ {

    public static volatile ListAttribute<Guardian, Student> students;
    public static volatile SingularAttribute<Guardian, Boolean> active;

}