package by.epam.java_introduction.module5.task4;

public class IronTreasure extends Treasure {
    public IronTreasure() {
        this.setType(TreasureTypes.IRON);
        this.setName("ironThing" + (int)(1 + Math.random() * 100));
        this.setCost((int)(1 + Math.random() * 20));
    }
}
