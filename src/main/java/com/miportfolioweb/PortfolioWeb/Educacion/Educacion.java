package com.miportfolioweb.PortfolioWeb.Educacion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "Educacion")
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEd;
    private String titleEd;
    private String descriptionEd;
    private int anioEgresoEd;
    
    public long getId() {
        return idEd;
    }
    
    public void setId(long idEd) {
        this.idEd = idEd;
    }
    
        public String getTitle() {
        return titleEd;
    }
    
    public void setTitle(String titleEd) {
        this.titleEd = titleEd;
    }
    
    public String getDescription() {
        return descriptionEd;
    }
    
    public void setDesciption(String descriptionEd) {
        this.descriptionEd = descriptionEd;
    }
    
    public int getAnioEgreso() {
        return anioEgresoEd;
    }
    
    public void setAnioEgreso(int anioEgresoEd) {
        this.anioEgresoEd = anioEgresoEd;
    }
}
