package com.miportfolioweb.PortfolioWeb.Experiencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "datospersonales")
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titleEx;
    private String descriptionEx;
    private String linkEx;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return titleEx;
    }
    
    public void setTitle(String titleEx) {
        this.titleEx = titleEx;
    }
    
        public String getDescription() {
        return descriptionEx;
    }
    
    public void setDescription(String descriptionEx) {
        this.descriptionEx = descriptionEx;
    }
    
        public String getLink() {
        return linkEx;
    }
    
    public void setLink(String linkEx) {
        this.linkEx = linkEx;
    }
}