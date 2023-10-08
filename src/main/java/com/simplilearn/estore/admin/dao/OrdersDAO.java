package com.simplilearn.estore.admin.dao;

import java.util.List;

import com.simplilearn.estore.admin.model.Orders;
import com.simplilearn.estore.dao.DAO;
import com.simplilearn.estore.db.DB;

public class OrdersDAO implements DAO<Orders> {

    DB db = DB.getDB();

    @Override
    public Orders get(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Orders> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Orders object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Orders object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }
}
