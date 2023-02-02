package com.miportfolioweb.PortfolioWeb.Repositorios;

import com.miportfolioweb.PortfolioWeb.Proyectos.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositorioProyectos extends JpaRepository<Proyectos, Long>{
    
}
