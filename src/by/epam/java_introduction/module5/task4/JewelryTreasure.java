package by.epam.java_introduction.module5.task4;

public class JewelryTreasure extends Treasure {
    public JewelryTreasure() {
        this.setType(TreasureTypes.JEWELRY);
        this.setName("diamond" + (int)(1 + Math.random() * 100));
        this.setCost((int)(200 + Math.random() * 200));
    }
}
