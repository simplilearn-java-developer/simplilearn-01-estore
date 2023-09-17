package com.simplilearn.estore.enduser.service;

import com.simplilearn.estore.admin.model.Orders;
import com.simplilearn.estore.admin.model.Users;

public interface IOrderService {

	public Boolean placeOrder(Users user, Orders order);

}
