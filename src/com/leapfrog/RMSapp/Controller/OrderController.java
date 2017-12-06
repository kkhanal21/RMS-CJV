/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.RMSapp.Controller;

import com.leapfrog.RMSapp.DAO.OrderDAO;
import com.leapfrog.RMSapp.DAO.ProductDAO;
import com.leapfrog.RMSapp.entity.Order;
import com.leapfrog.RMSapp.entity.Product;
import com.leapfrog.RMSapp.impl.OrderDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Cena
 */
public class OrderController {

    private OrderDAO odDAO;
    private ProductDAO pdtDAO;
    private Scanner input;

    public OrderController(OrderDAO odDAO, ProductDAO pdtDAO, Scanner input) {
        this.odDAO = odDAO;
        this.pdtDAO = pdtDAO;
        this.input = input;
    }

    public void takeOrder() {
        Order od = new Order();
        ProductController pc = new ProductController(pdtDAO, input);
        pc.showView();
        System.out.println("Enter the Id:");
        int Id = input.nextInt();
        od.setId(Id);

        Product p = pdtDAO.getById(Id);
        if (p != null) {
            System.out.println("Name: " + " " + p.getName());
            System.out.println("Price: " + " " + p.getPrice());
            System.out.println("Quantity: " + " " + p.getQuantity());
        } else {
            System.out.println("Not Found");
        }
        System.out.println("Enter Quantity of Product: ");
        od.setQuantity(input.nextInt());
        if (od.getQuantity() <= p.getQuantity()) {

            System.out.println("Name: " + " " + p.getName());
            System.out.println("Price: " + " " + p.getPrice());
            System.out.println("Quantity: " + " " + od.getQuantity());
            System.out.println("Order is Placed");
            odDAO.insert(od);
        } else {
            System.out.println("Order is Invalid");
        }
    }

    public void reportView() {
        odDAO.getOrder();
    }
}
