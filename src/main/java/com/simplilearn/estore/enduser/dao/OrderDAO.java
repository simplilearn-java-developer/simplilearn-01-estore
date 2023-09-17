package com.simplilearn.estore.enduser.dao;

import java.util.HashMap;
import java.util.Map;

import com.simplilearn.estore.admin.model.Orders;
import com.simplilearn.estore.admin.model.Users;

public class OrderDAO implements IOrderDAO {

    Map<Integer, Users> userEntry;
    Map<Integer, Orders> orderEntry;

    public OrderDAO() {
        userEntry = new HashMap<Integer, Users>();
        orderEntry = new HashMap<Integer, Orders>();
    }

    @Override
    public Boolean placeOrder(Users user, Orders order) {
        // Logic goes Here
        return true;
    }

    @Override
    public Orders getOrderDetails(int orderId) {
        Orders order = new Orders();
        // Logic goes Here

        return order;

    }

}
