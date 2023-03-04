package com.example.efinal2_api_cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.efinal2_api_cc.modelo.Venta;
import com.example.efinal2_api_cc.service.IVentaService;

@RestController
@RequestMapping("/ventas")
@CrossOrigin("http://localhost:8080/")
public class VentaRestfullController {

    @Autowired
    private IVentaService ventaService;

    @PostMapping
    public String ingresarVentas(@RequestBody Venta venta) {
        ventaService.ingresar(venta);

        return "se ingreso correctamente";

    }

}
