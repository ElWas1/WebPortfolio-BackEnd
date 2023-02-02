package com.miportfolioweb.PortfolioWeb.Repositorios;

import com.miportfolioweb.PortfolioWeb.Datospersonales.Datospersonales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioDatospersonales extends JpaRepository<Datospersonales, Long> {
    
}
