package javaeetutorial.dukestutoring.entity;

import java.util.Calendar;
import javaeetutorial.dukestutoring.entity.Student;
import javaeetutorial.dukestutoring.entity.TutoringSession;
import javaeetutorial.dukestutoring.util.StatusType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2015-02-11T11:09:30")
@StaticMetamodel(StatusEntry.class)
public class StatusEntry_ { 

    public static volatile SingularAttribute<StatusEntry, Long> id;
    public static volatile SingularAttribute<StatusEntry, Student> student;
    public static volatile SingularAttribute<StatusEntry, Calendar> statusDate;
    public static volatile SingularAttribute<StatusEntry, StatusType> currentStatus;
    public static volatile SingularAttribute<StatusEntry, TutoringSession> tutoringSession;

}