package rw.ac.auca.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.UUID;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")

    private UUID tid;
    private String tCode;
    private String name;
    private String email;
    private String phone;
    @Enumerated(EnumType.STRING)
    @Column(name = "qualification")
    private EQualificatio qualification;

    public Teacher() {

    }

    public Teacher(UUID tid, String tCode, String name, String email, String phone, EQualificatio qualification) {
        this.tid = tid;
        this.tCode = tCode;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.qualification = qualification;
    }

    public UUID getTid() {
        return tid;
    }

    public void setTid(UUID tid) {
        this.tid = tid;
    }

    public String gettCode() {
        return tCode;
    }

    public void settCode(String tCode) {
        this.tCode = tCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EQualificatio getQualification() {
        return qualification;
    }

    public void setQualification(EQualificatio qualification) {
        this.qualification = qualification;
    }
}
