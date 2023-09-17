package com.simplilearn.estore.enduser.service;

import com.simplilearn.estore.admin.model.Orders;
import com.simplilearn.estore.admin.model.Users;
import com.simplilearn.estore.enduser.dao.OrderDAO;

public class OrderService implements IOrderService {

    OrderDAO dao;

    public OrderService() {
        dao = new OrderDAO();
    }

    @Override
    public Boolean placeOrder(Users user, Orders order) {
        return dao.placeOrder(user, order);
    }

}
