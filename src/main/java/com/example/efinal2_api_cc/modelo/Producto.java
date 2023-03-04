package com.example.efinal2_api_cc.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @SequenceGenerator(name = "secProducto", sequenceName = "secProducto", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secProducto")
    @Column(name = "pro_id")
    private int id;

    @Column(name = "pro_codBarras")
    private String codigoBarras;

    @Column(name = "pro_nombre")
    private String nombre;

    @Column(name = "pro_categoria")
    private String categoria;

    @Column(name = "pro_stock")
    private int stock;

    @Column(name = "pro_precio")
    private int precio;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
