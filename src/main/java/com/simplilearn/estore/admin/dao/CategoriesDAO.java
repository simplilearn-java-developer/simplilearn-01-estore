package com.simplilearn.estore.admin.dao;

import java.util.List;

import com.simplilearn.estore.admin.model.Categories;
import com.simplilearn.estore.dao.DAO;
import com.simplilearn.estore.db.DB;

public class CategoriesDAO implements DAO<Categories> {

    DB db = DB.getDB();

    @Override
    public Categories get(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Categories> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Categories object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Categories object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }




}
