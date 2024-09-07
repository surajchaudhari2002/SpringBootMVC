package com.mvcapplication.firstmvc.service;

import com.mvcapplication.firstmvc.model.Products;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class ProductService {
    List<Products> products=Arrays.asList(new Products("Iphone",101,50000),
            new Products("Samsung",102,50000),
            new Products("Oneplus",103,30000));
    public List<Products> getProducts(){
        return products;
    }

}
