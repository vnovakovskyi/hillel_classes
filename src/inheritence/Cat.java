package inheritence;

public class Cat extends Animal {
    private final int maxDistance = 200;
    private static int catCount;

    public Cat() {
        super.maxDistance = this.maxDistance;
        incrementCat();
    }

    public Cat(boolean isSwim) {
        super.isSwim = isSwim;
        super.maxDistance = this.maxDistance;
        incrementCat();
    }

    public static void incrementCat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }
}
