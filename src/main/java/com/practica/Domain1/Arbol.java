/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.Domain1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data  //automatiza los set y get
@Entity
@Table(name = "practica")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private Long idArbol;

    private String tipo_flor;
    private String dureza_madera;
    private double altura;
    private int edad;
    private String origen;

    public Arbol() {
    }

    public Arbol(String tipo_flor, String dureza_madera, double altura, int edad) {
        this.tipo_flor = tipo_flor;
        this.dureza_madera = dureza_madera;
        this.altura = altura;
        this.edad = edad;
        this.origen = origen;
    }

}
