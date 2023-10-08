package com.simplilearn.estore.admin.dao;

import java.util.List;

import com.simplilearn.estore.admin.model.Shipments;
import com.simplilearn.estore.dao.DAO;
import com.simplilearn.estore.db.DB;

public class ShipmentsDAO implements DAO<Shipments> {

    DB db = DB.getDB();

    @Override
    public Shipments get(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Shipments> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Shipments object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Shipments object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }
}
