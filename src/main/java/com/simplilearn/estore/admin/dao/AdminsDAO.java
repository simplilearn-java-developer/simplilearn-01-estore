package com.simplilearn.estore.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.simplilearn.estore.admin.model.Admins;
import com.simplilearn.estore.dao.DAO;
import com.simplilearn.estore.db.DB;

public class AdminsDAO implements DAO<Admins> {

    DB db = DB.getDB();

    @Override
    public Admins get(long id) {

        String sql = "SELECT * FROM ADMIN WHERE adminId = " + id;

        ResultSet rs = db.executeQuery(sql);

        Admins admin = null;

        try {
            if (rs.next()) {

                admin = new Admins();

                admin.setAdminId(rs.getInt("adminId"));
                admin.setEmail(rs.getString("email"));
                admin.setPassword(rs.getString("password"));
                admin.setFullName(rs.getString("fullName"));
                admin.setLoginType(rs.getInt("loginType"));
                admin.setAddedOn(rs.getDate("addedOn"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return admin;
    }

    @Override
    public List<Admins> getAll() {
    	
        String sql = "SELECT * FROM ADMIN";

        ResultSet rs = db.executeQuery(sql);

        List<Admins> admins = new ArrayList<>();

        try {
            while (rs.next()) {

            	Admins admin = new Admins();

                admin.setAdminId(rs.getInt("adminId"));
                admin.setEmail(rs.getString("email"));
                admin.setPassword(rs.getString("password"));
                admin.setFullName(rs.getString("fullName"));
                admin.setLoginType(rs.getInt("loginType"));
                admin.setAddedOn(rs.getDate("addedOn"));
                
                admins.add(admin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return admins;
    }

    @Override
    public void save(Admins object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Admins object) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub

    }

    public void login(Admins object) {

        try {
            String sql = "select * from Admins where email = '"+object.getEmail()+"' and password = '"+object.getPassword()+"'";
            ResultSet set = db.executeQuery(sql);
            if(set.next()) {
                object.setAdminId(set.getInt("adminId"));
                object.setFullName(set.getString("fullName"));
                object.setEmail(set.getString("email"));
                object.setLoginType(set.getInt("loginType"));
                object.setPassword(set.getString("password"));
                String date = set.getString("addedOn");
                SimpleDateFormat format = new SimpleDateFormat("YYYY:MM:DD");
                Date addedOn = format.parse(date);
                object.setAddedOn(addedOn);
            }
        }catch(Exception e) {
            System.out.println("Something went wrong: "+e);
        }
    }


}
