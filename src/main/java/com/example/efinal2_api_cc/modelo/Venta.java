package com.example.efinal2_api_cc.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @SequenceGenerator(name = "secVenta", sequenceName = "secVenta", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secVenta")
    @Column(name = "ven_id")
    private int id;

    @Column(name = "ven_numVenta")
    private int numVenta;

    @Column(name = "ven_cedCliente")
    private String cedCliente;

    @Column(name = "ven_totalVenta")
    private int totalVenta;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumVenta() {
        return this.numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public String getCedCliente() {
        return this.cedCliente;
    }

    public void setCedCliente(String cedCliente) {
        this.cedCliente = cedCliente;
    }

    public int getTotalVenta() {
        return this.totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

}
