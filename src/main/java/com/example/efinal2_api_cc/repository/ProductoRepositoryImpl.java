package com.example.efinal2_api_cc.repository;

import org.springframework.stereotype.Repository;

import com.example.efinal2_api_cc.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void ingresar(Producto producto) {
        // TODO Auto-generated method stub
        this.entityManager.persist(producto);
    }

}
