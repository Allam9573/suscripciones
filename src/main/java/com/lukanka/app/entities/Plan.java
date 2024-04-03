package com.lukanka.app.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "planes")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplan")
    private int idPlan;
    private String descripcion;
    @Column(columnDefinition = "decimal(10,2)")
    private double precio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idstreaming", referencedColumnName = "idstreaming")
    private TipoStreaming tipoStreaming;

}
