package com.example.efinal2_api_cc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.efinal2_api_cc.modelo.Producto;
import com.example.efinal2_api_cc.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository ProductoRepository;

    @Override
    public void ingresar(Producto producto) {
        // TODO Auto-generated method stub
        this.ProductoRepository.ingresar(producto);
    }

}
