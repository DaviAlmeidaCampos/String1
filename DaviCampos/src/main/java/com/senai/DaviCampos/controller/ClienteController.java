package com.senai.DaviCampos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.DaviCampos.entities.Cliente;
import com.senai.DaviCampos.services.ClienteService;

@RestController
@RequestMapping("/clients")
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente createClients(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{idcCliente}")
    public Cliente getCliente(@PathVariable Long idcCliente) {
        return clienteService.getClienteById(idcCliente);
    }

    @DeleteMapping("/{idcCliente}")
    public void deleteCliente(@PathVariable Long idcCliente) {
        clienteService.deleteCliente(idcCliente);
    }

}