/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.RMSapp;

import com.leapfrog.RMSapp.Controller.OrderController;
import com.leapfrog.RMSapp.Controller.ProductController;
import com.leapfrog.RMSapp.DAO.OrderDAO;
import com.leapfrog.RMSapp.DAO.ProductDAO;
import com.leapfrog.RMSapp.entity.Product;
import com.leapfrog.RMSapp.impl.ProductDAOImpl;
import com.leapfrog.RMSapp.entity.Order;
import com.leapfrog.RMSapp.impl.OrderDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cena
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductDAO pdtDAO = new ProductDAOImpl();
        OrderDAO odDAO = new OrderDAOImpl();
        Scanner input = new Scanner(System.in);
        ProductController pc = new ProductController(pdtDAO, input);
        OrderController oc = new OrderController(odDAO, pdtDAO, input);
        while (true) {
            pc.menu();
            switch (input.nextInt()) {
                case 1:
                    pc.addView();
                    break;
                case 2:
                    pc.showView();
                    break;
                case 3:
                    pc.searchView();
                    break;
                case 4:
                    oc.takeOrder();
                    break;
                case 5:
                    oc.reportView();
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
            }

        }

    }

}
