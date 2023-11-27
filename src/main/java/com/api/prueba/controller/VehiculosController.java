package com.api.prueba.controller;

import com.api.prueba.model.Clientes;
import com.api.prueba.model.Vehiculos;
import com.api.prueba.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculo")
@CrossOrigin(origins = "http://localhost:4200")
public class VehiculosController {

    @Autowired
    private VehiculoService vehiculosService;

    @GetMapping
    public List<Vehiculos> listar(){
        return ResponseEntity.ok(vehiculosService.getVehiculos()).getBody();
    }

    @PostMapping
    public  ResponseEntity<Vehiculos> crear(@RequestBody Vehiculos vehiculos) {
        vehiculosService.crearVehiculo(vehiculos);
        return new ResponseEntity<>(vehiculos, HttpStatus.CREATED);
    }

    @PatchMapping("editar/{id}")
    public Vehiculos actualizar(@RequestBody Vehiculos vehiculos, @PathVariable Long id){
        vehiculos.setId(id);
        return vehiculosService.actualizarVehiculo(vehiculos);
    }

    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        vehiculosService.eliminarVehiculo(id);
    }

}
