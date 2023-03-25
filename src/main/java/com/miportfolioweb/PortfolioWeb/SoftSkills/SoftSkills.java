package com.miportfolioweb.PortfolioWeb.SoftSkills;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "softskills")
public class SoftSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int porcentaje;
    private String linkFt;

    public long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }
    
    public String getLink() {
        return linkFt;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public void setLink(String link) {
        this.linkFt = link;
    }
}