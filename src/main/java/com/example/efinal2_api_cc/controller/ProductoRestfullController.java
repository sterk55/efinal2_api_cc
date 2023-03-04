package com.example.efinal2_api_cc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.efinal2_api_cc.modelo.Producto;
import com.example.efinal2_api_cc.service.IProductoService;

@RestController
@RequestMapping("/productos")
@CrossOrigin("http://localhost:8080/")
public class ProductoRestfullController {

    @Autowired
    private IProductoService productoService;

    @PostMapping
    public String ingresarProducto(@RequestBody Producto producto) {
        productoService.ingresar(producto);
        // Producto pro = new Producto();
        /*
         * if(producto.getCodigoBarras() == pro.getCodigoBarras())
         * {
         * pro.setStock(pro.getStock() + producto.getStock());
         * }else{
         * productoService.ingresar(producto);
         * }
         */
        return "Se ingreso correctamente";
    }

}
