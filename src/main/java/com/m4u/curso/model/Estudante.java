package com.m4u.curso.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="students")

public class Estudante {
    @Id
    @GeneratedValue
    private int idstudents;
    private String name;
    private int age;
    private String email;
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="idstudents")
    private List<Endereco> endereco;


    public Estudante() {
    }

    public int getIdstudents() {
        return idstudents;
    }

    public void setIdstudents(int idstudents) {
        this.idstudents = idstudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "id=" + idstudents +
                ", Nome='" + name + '\'' +
                ", Idade='" + age +
                ", Email='" + email + '\'' +
                ", CPF='" + cpf + '\'' +
                '}';
    }

}
