package com.miportfolioweb.PortfolioWeb.Controller;

import Cliente.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes() {
        
        List <Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente(1L, "Zlatan", "Capo"));
        listaClientes.add(new Cliente(2L, "Julián", "Álvarez"));
        listaClientes.add(new Cliente(3L, "Lionel", "Messi"));
        
        return listaClientes;
    }

    
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli) {
        System.out.println("Datos cliente: " + cli.getNombre(cli.nombre)
                            + " Apellido: " + cli.getApellido(cli.apellido));
    }
}
