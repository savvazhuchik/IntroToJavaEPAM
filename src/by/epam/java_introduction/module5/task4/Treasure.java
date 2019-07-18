package by.epam.java_introduction.module5.task4;

public class Treasure {
    private int cost;
    private String name;
    private TreasureTypes type;

    public void setType(TreasureTypes type) {
        this.type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public TreasureTypes getType() {
        return type;
    }
}
