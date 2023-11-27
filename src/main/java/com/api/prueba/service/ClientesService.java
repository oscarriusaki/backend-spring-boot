package com.api.prueba.service;

import com.api.prueba.model.Clientes;
import com.api.prueba.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> getClientes(){
        return  clientesRepository.findAll();
    }

    public Clientes crearClientes (Clientes cliente) {
        return clientesRepository.save(cliente);
    }

    public Clientes actualizarClientes (Clientes cliente) {
        return clientesRepository.save(cliente);
    }

    public void eliminarCliente(Long id){
        clientesRepository.deleteById(id);
    }

}
