package com.example.InmoCarlosIII.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropiedadDTO {

    private String provincia;

    private String municipio;

    private String direccion;

    private Double precio;

    private String tipo;

    private String habitaciones;

    private String banyos;

    private String superficie;

    private String estado;

    private String imagenes;
}