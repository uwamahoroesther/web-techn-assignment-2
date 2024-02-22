package rw.ac.auca.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class StudentRegistration {
    @Id
    private UUID stdregId;
    private String studentId;
    private LocalDate registrationDate;
    @ManyToOne
    @JoinColumn(name = "id")
    private AccademicUnit accademicUnit;
    @Enumerated(EnumType.STRING)
    private ERegistrationStatus Regstatus;
    @ManyToOne
    @JoinColumn(name = "stdId")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "sId")
    private Semester semester;

    public StudentRegistration() {
    }

    public StudentRegistration(UUID stdregId, String studentId, LocalDate registrationDate, AccademicUnit accademicUnit, ERegistrationStatus regstatus, Student student, Semester semester) {
        this.stdregId = stdregId;
        this.studentId = studentId;
        this.registrationDate = registrationDate;
        this.accademicUnit = accademicUnit;
        Regstatus = regstatus;
        this.student = student;
        this.semester = semester;
    }

    public UUID getStdregId() {
        return stdregId;
    }

    public void setStdregId(UUID stdregId) {
        this.stdregId = stdregId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public AccademicUnit getAccademicUnit() {
        return accademicUnit;
    }

    public void setAccademicUnit(AccademicUnit accademicUnit) {
        this.accademicUnit = accademicUnit;
    }

    public ERegistrationStatus getRegstatus() {
        return Regstatus;
    }

    public void setRegstatus(ERegistrationStatus regstatus) {
        Regstatus = regstatus;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
