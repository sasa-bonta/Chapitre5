package com.company.CalculatingSales;

public class Product {
    private int productNumber;
    private float price;

    //Constructor
    public Product(int productNumber, float price) {
        this.productNumber = productNumber;
        this.price = price;
    }

    //Getters and setters
    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
