package com.miportfolioweb.PortfolioWeb.Controller;

import com.miportfolioweb.PortfolioWeb.Datospersonales.Datospersonales;
import com.miportfolioweb.PortfolioWeb.Repositorios.RepositorioDatospersonales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private RepositorioDatospersonales repoDatospersonales;

    @GetMapping(value = "/traerDatospersonales")
    public List<Datospersonales> getDatospersonales() {

    return repoDatospersonales.findAll();
    }
    
    @PostMapping(value = "/saveDatospersonales")
    public String saveDatospersonales(@RequestBody Datospersonales datospersonales) {
        repoDatospersonales.save(datospersonales);
        return "Saved datos personales";
    }
    
    @PutMapping(value = "/updateDatospersonales/{id}")
    public String updateDatospersonales(@PathVariable long id, @RequestBody Datospersonales datospersonales) {
        Datospersonales updatedDatospersonales = repoDatospersonales.findById(id).get();
        updatedDatospersonales.setNombre(datospersonales.getNombre());
        updatedDatospersonales.setApellido(datospersonales.getApellido());
        updatedDatospersonales.setMail(datospersonales.getMail());
        updatedDatospersonales.setTelefono(datospersonales.getTelefono());
        repoDatospersonales.save(updatedDatospersonales);
        return "Updated datos personales";
    }
    
    @DeleteMapping(value = "/deleteDatospersonales/{id}")
    public String deleteDatospersonales(@PathVariable long id) {
        Datospersonales deletedDatospersonales = repoDatospersonales.findById(id).get();
        repoDatospersonales.delete(deletedDatospersonales);
        return "Deleted datos personales";
    }
}
