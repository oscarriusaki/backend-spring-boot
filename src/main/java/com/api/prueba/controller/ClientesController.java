package com.api.prueba.controller;

import com.api.prueba.model.Clientes;
import com.api.prueba.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @CrossOrigin(origins = "http://localhost:4200/api/clientes", maxAge = 3600)
    @GetMapping
    public List<Clientes> listar(){
        List<Clientes> clientes = clientesService.getClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK).getBody();
    }

    @PostMapping
    public ResponseEntity<Clientes> crear(@RequestBody Clientes clientes) {
        clientesService.crearClientes(clientes);
        return new ResponseEntity<>(clientes, HttpStatus.CREATED);
    }

        @PatchMapping("editar/{id}")
    public ResponseEntity<Clientes> actualizar(@RequestBody Clientes clientes, @PathVariable Long id){
        clientes.setId(id);
        clientesService.actualizarClientes(clientes);
        return new ResponseEntity<>(clientes, HttpStatus.CREATED);
    }

    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        clientesService.eliminarCliente(id);
    }

}
