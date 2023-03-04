package com.example.efinal2_api_cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.efinal2_api_cc.modelo.DetalleVenta;
import com.example.efinal2_api_cc.service.IDetalleService;

@RestController
@RequestMapping("/detalles")
@CrossOrigin("http://localhost:8080/")
public class DetalleVentaRestfullController {

    @Autowired
    private IDetalleService detalleService;

    @PostMapping
    public void ingresarDetalles(@RequestBody DetalleVenta detalleVenta) {
        detalleService.ingresar(detalleVenta);
    }

}
