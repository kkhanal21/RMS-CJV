/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.RMSapp.impl;

import com.leapfrog.RMSapp.DAO.ProductDAO;
import com.leapfrog.RMSapp.entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cena
 */
public class ProductDAOImpl implements ProductDAO {

    List<Product> pdtList = new ArrayList<>();

    @Override
    public List<Product> getAll() {
        return pdtList;
    }

    @Override
    public boolean insert(Product p) {
        return pdtList.add(p);
    }

    @Override
    public Product getById(int id) {
        for(Product p : pdtList){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
        
    }

    @Override
    public int count() {
        return pdtList.size();
    }

    @Override
    public Product getByIndex(int index) {
        return pdtList.get(index);
    }

}
