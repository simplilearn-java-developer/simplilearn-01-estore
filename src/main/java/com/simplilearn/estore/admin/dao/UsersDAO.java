package com.simplilearn.estore.admin.dao;

import java.util.List;

import com.simplilearn.estore.admin.model.Users;
import com.simplilearn.estore.dao.DAO;
import com.simplilearn.estore.db.DB;

public class UsersDAO implements DAO<Users> {

    DB db = DB.getDB();

    @Override
    public Users get(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Users> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Users object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Users object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }

    public String registeruser(Users object) {

        Users User= new Users();

        // DB Code goes here

        return "Thank you for Registering";

    }



}
