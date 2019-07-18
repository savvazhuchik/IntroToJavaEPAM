package by.epam.java_introduction.module5.task4;

public class SilverTreasure extends Treasure {
    public SilverTreasure() {
        this.setType(TreasureTypes.SILVER);
        this.setName("silverTreasure" + (int)(1 + Math.random() * 100));
        this.setCost((int)(50 + Math.random() * 50));
    }
}
