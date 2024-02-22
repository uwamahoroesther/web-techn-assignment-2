package rw.ac.auca.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Semester {
    @Id
    private UUID sId;
    @Column(unique = true)
    private String semId;
    private LocalDate startDate;
    private LocalDate endDate;

    public Semester() {
    }

    public Semester(UUID sId, String semId, LocalDate startDate, LocalDate endDate) {
        this.sId = sId;
        this.semId = semId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UUID getsId() {
        return sId;
    }

    public void setsId(UUID sId) {
        this.sId = sId;
    }

    public String getSemId() {
        return semId;
    }

    public void setSemId(String semId) {
        this.semId = semId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
