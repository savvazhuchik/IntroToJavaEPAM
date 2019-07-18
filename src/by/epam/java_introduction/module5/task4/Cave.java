package by.epam.java_introduction.module5.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cave {
    private static Cave cave;
    private ArrayList<Treasure> treasures;

    private static final int amountOfAll = 100;
    private static final int amountOfGoldenTreasures = 20;
    private static final int amountOfJewelryTreasures = 10;
    private static final int amountOfSilverTreasures = 30;
    private static final int amountOfIronTreasures = 40;

    private Cave() {
    }

    public static Cave getCave() {      // Singleton with generation 100 treasures to Cave
        if(cave == null) {
            cave = new Cave();
            cave.treasures = new ArrayList<>();

            for(int x = 0; x < amountOfGoldenTreasures; x++) {
                TreasureFactory treasure = new TreasureFactory();
                Treasure treasureToAdd = treasure.getTreasure(TreasureTypes.GOLD);
                cave.treasures.add(treasureToAdd);
            }

            for(int x = 0; x < amountOfJewelryTreasures; x++) {
                TreasureFactory treasure = new TreasureFactory();
                Treasure treasureToAdd = treasure.getTreasure(TreasureTypes.JEWELRY);
                cave.treasures.add(treasureToAdd);
            }

            for(int x = 0; x < amountOfSilverTreasures; x++) {
                TreasureFactory treasure = new TreasureFactory();
                Treasure treasureToAdd = treasure.getTreasure(TreasureTypes.SILVER);
                cave.treasures.add(treasureToAdd);
            }

            for(int x = 0; x < amountOfIronTreasures; x++) {
                TreasureFactory treasure = new TreasureFactory();
                Treasure treasureToAdd = treasure.getTreasure(TreasureTypes.IRON);
                cave.treasures.add(treasureToAdd);
            }
        } else {
            System.out.println("The cave has already been created");
        }
        return cave;
    }

    public void viewAllTreasures() {
        for(int x = 0; x < amountOfAll; x++) {
            Treasure tr = this.treasures.get(x);
            System.out.println(x+1 + ". " + tr.getName() + " (" + tr.getType() + ") \u2014 " + tr.getCost() + '$');
        }
    }

    public void viewTheMostExpensiveTreasure() {
        Treasure resultTreasure = treasures.get(0);

        for(int x = 0; x < amountOfAll; x++) {
            if(treasures.get(x).getCost() > resultTreasure.getCost()) {
                resultTreasure = treasures.get(x);
            }
        }

        System.out.println("The most expensive treasure: " + resultTreasure.getName() + " (" +
                resultTreasure.getType() + ") \u2014 " + resultTreasure.getCost() + '$');
    }

    public void buyTreasure(int money) { // I subscribe choices treasures as a purchase
        int purchaseCost = 0;
        int balance = money;
        viewAllTreasures();

        System.out.println("You have " + money + "$. Choice the treasures you want to buy. Write their numbers.");
        System.out.println("When you want to finish write - stop");
        System.out.println("-----------------------");

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String input = reader.readLine();

                if(input.equalsIgnoreCase("stop")) {

                    System.out.println("-----------------------");
                    System.out.println("Order cost: " + purchaseCost);
                    System.out.println("Thx! See you later!");
                    System.out.println("-----------------------");

                    break;
                }

                int inputInt = Integer.parseInt(input) - 1;

                if((this.treasures.get(inputInt).getCost() < balance)) {

                    purchaseCost += this.treasures.get(inputInt).getCost();

                    System.out.println("You bought " + this.treasures.get(inputInt).getName()
                                        + " " + this.treasures.get(inputInt).getCost()+'$');

                    balance -= this.treasures.get(inputInt).getCost();
                    System.out.println("Your balance: " + balance + '$');
                    System.out.println("-----------------------");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
