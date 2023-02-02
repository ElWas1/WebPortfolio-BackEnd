package com.miportfolioweb.PortfolioWeb.Repositorios;

import com.miportfolioweb.PortfolioWeb.Educacion.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositorioEducacion extends JpaRepository<Educacion, Long> {
    
}
