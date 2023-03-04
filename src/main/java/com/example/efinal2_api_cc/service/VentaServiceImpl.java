package com.example.efinal2_api_cc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.efinal2_api_cc.modelo.Venta;
import com.example.efinal2_api_cc.repository.IVentaRespository;

@Service
public class VentaServiceImpl implements IVentaService {

    @Autowired
    private IVentaRespository iVentaRespository;

    @Override
    public void ingresar(Venta venta) {
        // TODO Auto-generated method stub
        this.iVentaRespository.ingresar(venta);
    }

}
