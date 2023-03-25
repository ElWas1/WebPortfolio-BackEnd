package com.miportfolioweb.PortfolioWeb.Datospersonales;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "datospersonales")
public class Datospersonales {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String mail;
    private int telefono;

    public long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public String getMail() {
        return mail;
    }
    
    public int getTelefono() {
        return telefono;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}