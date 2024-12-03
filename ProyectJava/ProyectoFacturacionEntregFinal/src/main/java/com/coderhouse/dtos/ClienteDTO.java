package com.coderhouse.dtos;

import java.util.Date;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    private Date fechaRegistro;

    
    
    
}
