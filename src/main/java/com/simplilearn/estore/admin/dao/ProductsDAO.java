package com.simplilearn.estore.admin.dao;

import java.util.List;

import com.simplilearn.estore.admin.model.Products;
import com.simplilearn.estore.dao.DAO;
import com.simplilearn.estore.db.DB;

public class ProductsDAO implements DAO<Products> {

    DB db = DB.getDB();

    @Override
    public Products get(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Products> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Products object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Products object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }




}
