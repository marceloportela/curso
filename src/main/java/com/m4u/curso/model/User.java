package com.m4u.curso.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private int iduser;
    private String user;
    private String password;


        public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public User() {
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + iduser +
                ", email='" + user + '\'' +
                ", senha='" + password + '}';
    }

}
