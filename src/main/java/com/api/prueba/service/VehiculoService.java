package com.api.prueba.service;

import com.api.prueba.model.Clientes;
import com.api.prueba.model.Vehiculos;
import com.api.prueba.repository.ClientesRepository;
import com.api.prueba.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;
    private final ClientesRepository clienteRepository;

    @Autowired
    public VehiculoService(VehiculoRepository vehiculoRepository, ClientesRepository clienteRepository) {
        this.vehiculoRepository = vehiculoRepository;
        this.clienteRepository = clienteRepository;
    }

    public List<Vehiculos> getVehiculos(){
        return  vehiculoRepository.findAll();
    }

    public Vehiculos crearVehiculo (Vehiculos vehiculos) {
        Optional<Clientes> clientes = clienteRepository.findById(vehiculos.getCliente().getId());
        Clientes cliente = clientes.get();
        vehiculos.setCliente(cliente);
        return vehiculoRepository.save(vehiculos);
    }

    public Vehiculos actualizarVehiculo (Vehiculos vehiculos) {
        return vehiculoRepository.save(vehiculos);
    }

    public void eliminarVehiculo(Long id){
        vehiculoRepository.deleteById(id);
    }

}
