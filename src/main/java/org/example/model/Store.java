package org.example.model;

public class Store {

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale p : products) {
            p.showDetails();
        }
    }

    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark Chocolate", 3.5, "Rich cocoa flavor", 70);
        products[1] = new Coke("Coca Cola", 1.5, "Refreshing soft drink", 330);
        products[2] = new Bread("Sourdough", 2.0, "Freshly baked sourdough", true);

        Store store = new Store();
        store.listProducts(products);
    }
}
