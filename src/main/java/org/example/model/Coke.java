package org.example.model;

public class Coke extends ProductForSale {

    private int volume; // ml

    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Volume: " + volume + " ml");
        System.out.println("Sales Price for 1: $" + getSalesPrice(1));
        System.out.println("---------------------------");
    }
}
