package com.miportfolioweb.PortfolioWeb.Proyectos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "proyectos")
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPr;
    private String titlePr;
    private String descriptionPr;
    private String linkPr;
    
    public long getId() {
        return idPr;
    }
    
    public void setId(long idPr) {
        this.idPr = idPr;
    }
    
    public String getTitle() {
        return titlePr;
    }
    
    public void setTitle(String titlePr) {
        this.titlePr = titlePr;
    }
    
        public String getDescription() {
        return descriptionPr;
    }
    
    public void setDescription(String descriptionPr) {
        this.descriptionPr = descriptionPr;
    }
    
        public String getLink() {
        return linkPr;
    }
    
    public void setLink(String linkPr) {
        this.linkPr = linkPr;
    }
}
