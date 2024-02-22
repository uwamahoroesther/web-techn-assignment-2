package rw.ac.auca.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Student {
    @Id
    private UUID stdId;
    private String regNo;
    private String fName;
    private String lName;
    private String dateOfBirth;

    public Student() {
    }

    public Student(UUID stdId, String regNo, String fName, String lName, String dateOfBirth) {
        this.stdId = stdId;
        this.regNo = regNo;
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getStdId() {
        return stdId;
    }

    public void setStdId(UUID stdId) {
        this.stdId = stdId;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
