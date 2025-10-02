package org.example.model;

public class Bread extends ProductForSale {

    private boolean wholeGrain;

    public Bread(String type, double price, String description, boolean wholeGrain) {
        super(type, price, description);
        this.wholeGrain = wholeGrain;
    }

    public boolean isWholeGrain() {
        return wholeGrain;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Whole Grain: " + (wholeGrain ? "Yes" : "No"));
        System.out.println("Sales Price for 1: $" + getSalesPrice(1));
        System.out.println("---------------------------");
    }
}
