package by.epam.java_introduction.module5.task4;

public class TreasureFactory {
    public Treasure getTreasure(TreasureTypes type) {
        Treasure result = null;
            switch (type) {
                case GOLD:
                    result = new GoldenTreasure();
                    break;
                case IRON:
                    result = new IronTreasure();
                    break;
                case SILVER:
                    result = new SilverTreasure();
                    break;
                case JEWELRY:
                    result = new JewelryTreasure();
                    break;

                    default:
                        throw new IllegalArgumentException("Wrong treasure type: " + type);
            }
        return result;
    }
}
