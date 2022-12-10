package inheritence;

public abstract class Animal {
    private static int animalCount;
    protected int maxDistance;
    protected boolean isSwim;

    public Animal() {
        incrementAnimalCount();
    }

    void run(int distance){
        if (distance > 0 && distance <= maxDistance) {
            System.out.println("Run, Forest, run");
        } else {
            System.out.println("Спробуйте ще раз!");
        }
    }

    void swim(int distance){
        if (isSwim && (distance > 0 && distance <= maxDistance)) {
            System.out.println("Wow, it's swimming");
        } else {
            System.out.println("Вибач, іншого разу!");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void incrementAnimalCount() {
        Animal.animalCount++;
    }
}
