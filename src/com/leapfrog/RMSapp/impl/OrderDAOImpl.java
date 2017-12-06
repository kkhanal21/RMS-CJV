/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.RMSapp.impl;

import com.leapfrog.RMSapp.DAO.OrderDAO;
import com.leapfrog.RMSapp.entity.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cena
 */
public class OrderDAOImpl implements OrderDAO {

    List<Order> odList = new ArrayList<>();

    @Override
    public List<Order> getOrder() {
        return odList;
    }

    @Override
    public boolean insert(Order o) {
        return odList.add(o);
    }

}
