package rw.ac.auca.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class StudentUser implements Serializable {
    @Id
    private UUID userId;
    private String StudentId;
    private String password;

    public StudentUser() {
    }

    public StudentUser(UUID userId) {
        this.userId = userId;
    }

    public StudentUser(UUID userId, String StudentId, String password) {
        this.userId = userId;
        this.StudentId = StudentId;
        this.password = password;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
