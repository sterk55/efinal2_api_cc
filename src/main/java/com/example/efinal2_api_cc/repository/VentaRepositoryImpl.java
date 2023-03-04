package com.example.efinal2_api_cc.repository;

import org.springframework.stereotype.Repository;

import com.example.efinal2_api_cc.modelo.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VentaRepositoryImpl implements IVentaRespository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void ingresar(Venta venta) {
        // TODO Auto-generated method stub
        this.entityManager.persist(venta);
    }

}
