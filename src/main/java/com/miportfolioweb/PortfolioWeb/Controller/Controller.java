package com.miportfolioweb.PortfolioWeb.Controller;

import com.miportfolioweb.PortfolioWeb.Datospersonales.Datospersonales;
import com.miportfolioweb.PortfolioWeb.Repositorios.RepositorioDatospersonales;

import com.miportfolioweb.PortfolioWeb.Educacion.Educacion;
import com.miportfolioweb.PortfolioWeb.Repositorios.RepositorioEducacion;

import com.miportfolioweb.PortfolioWeb.Experiencia.Experiencia;
import com.miportfolioweb.PortfolioWeb.Repositorios.RepositorioExperiencia;

import com.miportfolioweb.PortfolioWeb.HardSkills.HardSkills;
import com.miportfolioweb.PortfolioWeb.Repositorios.RepositorioHardSkills;

import com.miportfolioweb.PortfolioWeb.SoftSkills.SoftSkills;
import com.miportfolioweb.PortfolioWeb.Repositorios.RepositorioSoftSkills;

import com.miportfolioweb.PortfolioWeb.Proyectos.Proyectos;
import com.miportfolioweb.PortfolioWeb.Repositorios.RepositorioProyectos;

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

    // Datos Personales
    
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
    
    // Educacion
    
    @Autowired
    private RepositorioEducacion repoEducacion;

    @GetMapping(value = "/traerEducacion")
    public List<Educacion> getEducacion() {
        return repoEducacion.findAll();
    }

    @PostMapping(value = "/saveEducacion")
    public String saveEducacion(@RequestBody Educacion educacion) {
            repoEducacion.save(educacion);
            return "Saved education";
        }

    @PutMapping(value = "/updateEducacion/{id}")
    public String updateEducacion(@PathVariable long id, @RequestBody Educacion educacion) {
        Educacion updatedEducacion = repoEducacion.findById(id).get();
        updatedEducacion.setTitle(educacion.getTitle());
        updatedEducacion.setDesciption(educacion.getDescription());
        updatedEducacion.setAnioEgreso(educacion.getAnioEgreso());
        repoEducacion.save(updatedEducacion);
        return "Updated education";
    }

    @DeleteMapping(value = "/deleteEducacion/{id}")
    public String deleteEducacion(@PathVariable long id) {
        Educacion deletedEducacion = repoEducacion.findById(id).get();
        repoEducacion.delete(deletedEducacion);
        return "Deleted education";
    }
    
    // Proyectos
    
    @Autowired
    private RepositorioProyectos repoProyectos;

    @GetMapping(value = "/traerProyectos")
    public List<Proyectos> getProyectos() {
        return repoProyectos.findAll();
    }

    @PostMapping(value = "/saveProyectos")
    public String saveProyectos(@RequestBody Proyectos proyectos) {
            repoProyectos.save(proyectos);
            return "Saved project";
        }

    @PutMapping(value = "/updateProyectos/{id}")
    public String updateProyectos(@PathVariable long id, @RequestBody Proyectos proyectos) {
        Proyectos updatedProyectos = repoProyectos.findById(id).get();
        updatedProyectos.setTitle(proyectos.getTitle());
        updatedProyectos.setDescription(proyectos.getDescription());
        updatedProyectos.setLink(proyectos.getLink());
        repoProyectos.save(updatedProyectos);
        return "Updated project";
    }

    @DeleteMapping(value = "/deleteProyectos/{id}")
    public String deleteProyectos(@PathVariable long id) {
        Proyectos deletedProyectos = repoProyectos.findById(id).get();
        repoProyectos.delete(deletedProyectos);
        return "Deleted project";
    }
    
    // Experiencia
    
    @Autowired
    private RepositorioExperiencia repoExperiencia;

    @GetMapping(value = "/traerExperiencia")
    public List<Experiencia> getExperiencia() {
        return repoExperiencia.findAll();
    }

    @PostMapping(value = "/saveExperiencia")
    public String saveExperiencia(@RequestBody Experiencia experiencia) {
            repoExperiencia.save(experiencia);
            return "Saved Experiencia";
        }

    @PutMapping(value = "/updateExperiencia/{id}")
    public String updateExperiencia(@PathVariable long id, @RequestBody Experiencia experiencia) {
        Experiencia updatedExperiencia = repoExperiencia.findById(id).get();
        updatedExperiencia.setTitle(experiencia.getTitle());
        updatedExperiencia.setDescription(experiencia.getDescription());
        updatedExperiencia.setLink(experiencia.getLink());
        repoExperiencia.save(updatedExperiencia);
        return "Updated Experiencia";
    }

    @DeleteMapping(value = "/deleteExperiencia/{id}")
    public String deleteExperiencia(@PathVariable long id) {
        Experiencia deletedExperiencia = repoExperiencia.findById(id).get();
        repoExperiencia.delete(deletedExperiencia);
        return "Deleted Experiencia";
    }
    
    // Hard Skills
    
    @Autowired
    private RepositorioHardSkills repoHardSkills;

    @GetMapping(value = "/traerHardSkills")
    public List<HardSkills> getHardSkills() {
        return repoHardSkills.findAll();
    }

    @PostMapping(value = "/saveHardSkills")
    public String saveHardSkills(@RequestBody HardSkills hardSkills) {
            repoHardSkills.save(hardSkills);
            return "Saved HardSkills";
        }

    @PutMapping(value = "/updateHardSkills/{id}")
    public String updateHardSkills(@PathVariable long id, @RequestBody HardSkills hardSkills) {
        HardSkills updatedHardSkills = repoHardSkills.findById(id).get();
        updatedHardSkills.setNombre(hardSkills.getNombre());
        updatedHardSkills.setPorcentaje(hardSkills.getPorcentaje());
        updatedHardSkills.setLink(hardSkills.getLink());
        repoHardSkills.save(updatedHardSkills);
        return "Updated HardSkills";
    }

    @DeleteMapping(value = "/deleteHardSkills/{id}")
    public String deleteHardSkills(@PathVariable long id) {
        HardSkills deletedHardSkills = repoHardSkills.findById(id).get();
        repoHardSkills.delete(deletedHardSkills);
        return "Deleted HardSkills";
    }
    
    // Soft Skills
    
    @Autowired
    private RepositorioSoftSkills repoSoftSkills;

    @GetMapping(value = "/traerSoftSkills")
    public List<SoftSkills> getSoftSkills() {
        return repoSoftSkills.findAll();
    }

    @PostMapping(value = "/saveSoftSkills")
    public String saveSoftSkills(@RequestBody SoftSkills softSkills) {
            repoSoftSkills.save(softSkills);
            return "Saved SoftSkills";
        }

    @PutMapping(value = "/updateSoftSkills/{id}")
    public String updateSoftSkills(@PathVariable long id, @RequestBody SoftSkills softSkills) {
        SoftSkills updatedSoftSkills = repoSoftSkills.findById(id).get();
        updatedSoftSkills.setNombre(softSkills.getNombre());
        updatedSoftSkills.setPorcentaje(softSkills.getPorcentaje());
        updatedSoftSkills.setLink(softSkills.getLink());
        repoSoftSkills.save(updatedSoftSkills);
        return "Updated SoftSkills";
    }

    @DeleteMapping(value = "/deleteSoftSkills/{id}")
    public String deleteSoftSkills(@PathVariable long id) {
        SoftSkills deletedSoftSkills = repoSoftSkills.findById(id).get();
        repoSoftSkills.delete(deletedSoftSkills);
        return "Deleted SoftSkills";
    }
}