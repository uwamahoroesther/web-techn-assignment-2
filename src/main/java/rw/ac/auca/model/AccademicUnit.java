package rw.ac.auca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;
@Entity
public class AccademicUnit {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String code;
    private String name;
    @Enumerated(EnumType.STRING)
    private EAccademicUnit unit;
    @ManyToOne
    @JoinColumn(name ="parent_id")
    private AccademicUnit parent;

    public AccademicUnit() {
    }

    public AccademicUnit(UUID id, String code, String name, EAccademicUnit unit, AccademicUnit parent) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.unit = unit;
        this.parent = parent;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EAccademicUnit getUnit() {
        return unit;
    }

    public void setUnit(EAccademicUnit unit) {
        this.unit = unit;
    }

    public AccademicUnit getParent() {
        return parent;
    }

    public void setParent(AccademicUnit parent) {
        this.parent = parent;
    }
}
