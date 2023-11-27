package com.api.prueba.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
@Data
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String paterno;

    @Column
    private String materno;

    @Column(nullable = false)
    private String tipoDocumento;

    @Column(nullable = false)
    private String numeroDocumento;

    @Column
    private String fechaNacimiento;

    @Column
    private String genero;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Vehiculos> vehiculos = new ArrayList<>();

}
