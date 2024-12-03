package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "detalle_factura")
public class DetallaFactura {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_detalle")
	    private Long idDetalle;

	    @ManyToOne
	    @JoinColumn(name = "id_comprobante", nullable = false)
	    private Comprobante comprobante;

	    @ManyToOne
	    @JoinColumn(name = "id_producto", nullable = false)
	    private Producto producto;

	    @Column(name = "cantidad", nullable = false)
	    private Integer cantidad;

	    @Column(name = "subtotal", nullable = false)
	    private Double subtotal;
}
