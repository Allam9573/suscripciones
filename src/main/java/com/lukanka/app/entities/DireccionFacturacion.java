package com.lukanka.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "direccionfacturacion")
public class DireccionFacturacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddireccion")
    private int idDireccion;
    private String pais;
    private String estado;
    private String ciudad;

    @OneToOne(mappedBy = "direccionFacturacion")
    private Usuario usuario;

}
