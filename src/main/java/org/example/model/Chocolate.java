package org.example.model;

public class Chocolate extends ProductForSale {

    private double cocoaPercentage;

    public Chocolate(String type, double price, String description, double cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
        System.out.println("Sales Price for 1: $" + getSalesPrice(1));
        System.out.println("---------------------------");
    }
}
