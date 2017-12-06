/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.RMSapp.Controller;

import com.leapfrog.RMSapp.DAO.ProductDAO;
import com.leapfrog.RMSapp.entity.Product;
import java.util.Scanner;

/**
 *
 * @author Cena
 */
public class ProductController {

    private ProductDAO pdtDAO;
    private Scanner input;

    public ProductController(ProductDAO pdtDAO, Scanner input) {
        this.pdtDAO = pdtDAO;
        this.input = input;
    }

    public void menu() {
        System.out.println("1.Add Product");
        System.out.println("2.Show All Product");
        System.out.println("3.Search");
        System.out.println("4.Take Order");
        System.out.println("5.Order Report");
        System.out.println("6.Product Sales Report");
        System.out.println("7.Exit");
        System.out.println("Enter your choice:");
    }

    public void addView() {
       
        while (true) {
            Product p = new Product();

            int size = pdtDAO.count();
            p.setId((size == 0) ? 1 : pdtDAO.getByIndex(size - 1).getId() + 1);

            System.out.println("Enter Product name:");
            p.setName(input.next());
            System.out.println("Enter Price of product:");
            p.setPrice(input.nextDouble());
            System.out.println("Enter Quantity of product:");
            p.setQuantity(input.nextInt());

            pdtDAO.insert(p);

            System.out.println("Do you want to continue? [Y/N]:");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void showView() {
        pdtDAO.getAll().forEach(pp -> {
            System.out.println("Id:" + pp.getId());
            System.out.println("Product Name:" + pp.getName());
            System.out.println("Price:" + pp.getPrice());
            System.out.println("Quantity:" + pp.getQuantity());
        });
    }

    public void searchView() {
        System.out.println("Enter Product Id:");
        int Id = input.nextInt();
        Product p = pdtDAO.getById(Id);
        if (p != null) {
            System.out.println("Name: " + " " + p.getName());
            System.out.println("Price: " + " " + p.getPrice());
            System.out.println("Quantity: " + " " + p.getQuantity());
        } else {
            System.out.println("Not Found");
        }

    }
}
