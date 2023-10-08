package com.simplilearn.estore.admin.dao;

import java.util.List;

import com.simplilearn.estore.admin.model.OrderItems;
import com.simplilearn.estore.dao.DAO;
import com.simplilearn.estore.db.DB;

public class OrderItemsDAO implements DAO<OrderItems> {

    DB db = DB.getDB();

    @Override
    public OrderItems get(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<OrderItems> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(OrderItems object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(OrderItems object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }
}
