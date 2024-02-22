package rw.ac.auca.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class SystemUser implements Serializable {
    @Id
    private UUID userId;
    private String Email;
    private String Names;
    private String password;

    public SystemUser() {
    }

    public SystemUser(UUID userId) {
        this.userId = userId;
    }

    public SystemUser(UUID userId, String Email, String Names, String password) {
        this.userId = userId;
        this.Email = Email;
        this.Names = Names;
        this.password = password;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
