package rw.ac.auca.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class StudentCource {
    @Id
    private UUID stdCId;
    private Integer Credit;
    private BigDecimal results;
    @ManyToOne
    @JoinColumn(name = "stdregId")
    private StudentRegistration stdReg;
    @ManyToOne
    @JoinColumn(name = "cid")
    private Cource cource;

    public StudentCource() {
    }

    public StudentCource(UUID stdCId, Integer credit, BigDecimal results, StudentRegistration stdReg, Cource cource) {
        this.stdCId = stdCId;
        Credit = credit;
        this.results = results;
        this.stdReg = stdReg;
        this.cource = cource;
    }

    public UUID getStdCId() {
        return stdCId;
    }

    public void setStdCId(UUID stdCId) {
        this.stdCId = stdCId;
    }

    public Integer getCredit() {
        return Credit;
    }

    public void setCredit(Integer credit) {
        Credit = credit;
    }

    public BigDecimal getResults() {
        return results;
    }

    public void setResults(BigDecimal results) {
        this.results = results;
    }

    public StudentRegistration getStdReg() {
        return stdReg;
    }

    public void setStdReg(StudentRegistration stdReg) {
        this.stdReg = stdReg;
    }

    public Cource getCource() {
        return cource;
    }

    public void setCource(Cource cource) {
        this.cource = cource;
    }
}
