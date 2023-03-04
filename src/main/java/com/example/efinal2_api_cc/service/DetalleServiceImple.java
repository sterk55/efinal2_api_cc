package com.example.efinal2_api_cc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.efinal2_api_cc.modelo.DetalleVenta;
import com.example.efinal2_api_cc.repository.IDetalleRepository;

@Service
public class DetalleServiceImple implements IDetalleService {

    @Autowired
    private IDetalleRepository detalleRepository;

    @Override
    public void ingresar(DetalleVenta detalleVenta) {
        // TODO Auto-generated method stub
        this.detalleRepository.ingresar(detalleVenta);
    }

}
