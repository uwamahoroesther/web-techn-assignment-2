package rw.ac.auca.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Cource {
    @Id
    private UUID cid;
    @ManyToOne
    @JoinColumn( name = "cdId")
    private CourceDefinition courceDefinition;
    @ManyToOne
    @JoinColumn(name = "tId")
    private Teacher treTeacher;
    @ManyToOne
    @JoinColumn(name = "sId")
    private Semester semester;

    public Cource() {
    }

    public Cource(UUID cid, CourceDefinition courceDefinition, Teacher treTeacher, Semester semester) {
        this.cid = cid;
        this.courceDefinition = courceDefinition;
        this.treTeacher = treTeacher;
        this.semester = semester;
    }

    public UUID getCid() {
        return cid;
    }

    public void setCid(UUID cid) {
        this.cid = cid;
    }

    public CourceDefinition getCourceDefinition() {
        return courceDefinition;
    }

    public void setCourceDefinition(CourceDefinition courceDefinition) {
        this.courceDefinition = courceDefinition;
    }

    public Teacher getTreTeacher() {
        return treTeacher;
    }

    public void setTreTeacher(Teacher treTeacher) {
        this.treTeacher = treTeacher;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
