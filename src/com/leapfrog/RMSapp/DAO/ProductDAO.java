/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.RMSapp.DAO;

import com.leapfrog.RMSapp.entity.Product;
import java.util.List;

/**
 *
 * @author Cena
 */
public interface ProductDAO {
    List<Product> getAll();
    boolean insert(Product p);
    Product getById(int id);
    int count();
    Product getByIndex(int index);
    
}
