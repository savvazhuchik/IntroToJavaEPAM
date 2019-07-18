package by.epam.java_introduction.module5.task4;

public class GoldenTreasure extends Treasure {
    public GoldenTreasure() {
        this.setType(TreasureTypes.GOLD);
        this.setName("goldenTreasure" + (int)(1 + Math.random() * 100));
        this.setCost((int)(100 + Math.random() * 100));
    }
}
