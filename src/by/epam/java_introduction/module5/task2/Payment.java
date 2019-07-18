package by.epam.java_introduction.module5.task2;

import java.util.ArrayList;

public class Payment {
    private String storeName;
    private int paymentCost;
    private ArrayList<Purchase> purchases;

    private class Purchase {
        private String name;
        private int cost;

        private Purchase(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }
    }

    public Payment(String storeName) {
        this.storeName = storeName;
        purchases = new ArrayList<>();
    }

    public void addPurchase(String name, int cost) {
        Purchase purchase = new Purchase(name, cost);
        purchases.add(purchase);
        this.paymentCost += cost;
    }

    public void getCheck() {
        System.out.println("--------------");
        System.out.println("shop: " + this.storeName);
        System.out.println("--------------");
        for (int x = 0; x < purchases.size(); x++) {
            System.out.printf("%10s%n", x+1 + ". " + purchases.get(x).name + "  " + purchases.get(x).cost + "$\n");
        }
        System.out.println("--------------");
        System.out.printf("%10s%n", "Check: " + this.paymentCost+"$");
    }
}
