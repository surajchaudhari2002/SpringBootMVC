package com.mvcapplication.firstmvc.model;

import org.springframework.stereotype.Component;
@Component
    public class Products {
        private String ProductName ;
        private int ProductId;
        private int ProductPrice;

        public Products(String productName, int productId, int productPrice) {
            ProductName = productName;
            ProductId = productId;
            ProductPrice = productPrice;
        }

        public Products() {
        }

        public String getProductName() {
            return ProductName;
        }

        public void setProductName(String productName) {
            ProductName = productName;
        }

        public int getProductId() {
            return ProductId;
        }

        public void setProductId(int productId) {
            ProductId = productId;
        }

        public int getProductPrice() {
            return ProductPrice;
        }

        public void setProductPrice(int productPrice) {
            ProductPrice = productPrice;
        }


}
