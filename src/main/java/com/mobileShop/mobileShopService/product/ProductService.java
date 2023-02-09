package com.mobileShop.mobileShopService.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ProductService {
    Product iPhone = new Product(1, "iPhone 14", 999.00, "The iPhone is made by Apple");
    Product galaxyNote = new Product(2, "Galaxy Note", 899.00, "The Galaxy Note is made by Samsung");
    private ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(iPhone, galaxyNote));

    public ArrayList<Product> getAllProducts() {
        return products;
    }

}
