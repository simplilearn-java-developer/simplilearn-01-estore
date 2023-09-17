package com.simplilearn.estore.enduser.dao;

import com.simplilearn.estore.admin.model.Orders;
import com.simplilearn.estore.admin.model.Users;

public interface IOrderDAO {

	public Boolean placeOrder(Users user, Orders order);
	public Orders getOrderDetails(int orderId);

}
