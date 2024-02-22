package rw.ac.auca.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
public class CourceDefinition {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID cdId;
    @Column(unique = true)
    private String code;
    private String name;
    private Integer credit;
    private String description;

    public CourceDefinition() {
    }

    public CourceDefinition(UUID cdId, String code, String name, Integer credit, String description) {
        this.cdId = cdId;
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.description = description;
    }

    public UUID getCdId() {
        return cdId;
    }

    public void setCdId(UUID cdId) {
        this.cdId = cdId;
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

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
