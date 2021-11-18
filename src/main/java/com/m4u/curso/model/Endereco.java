package com.m4u.curso.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="adress")
public class Endereco {
    @Id
    @GeneratedValue
    private int idAdress;
    private String street;
    private String city;
    private String state;
    private String country;
    private Integer zipcode;

    public Endereco() {
    }

    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "endereco{" +
                "id=" + idAdress +
                ", logradora='" + street + '\'' +
                ", Cidade='" + city +
                '\'' +
                ", Estado='" + state +
                '\'' +
                ", CEP='" + zipcode +
                '\'' +
                ", País='" + country +
                '}';
    }
}
