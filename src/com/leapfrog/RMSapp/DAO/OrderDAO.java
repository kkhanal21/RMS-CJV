/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.RMSapp.DAO;

import com.leapfrog.RMSapp.entity.Order;
import java.util.List;

/**
 *
 * @author Cena
 */
public interface OrderDAO {
    List<Order>getOrder();
    boolean insert(Order o);
    
    
    
}
