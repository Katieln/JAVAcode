package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "factura")
public class Factura {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long idFactura;

    @OneToOne
    @JoinColumn(name = "id_comprobante", nullable = false)
    private Comprobante comprobante;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado; // Ejemplo: "PAGADA", "PENDIENTE"
}
