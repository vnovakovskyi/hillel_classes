package lesson1;

public class UkrainianMan extends CarDriver implements Human {

    private String name;
    private int age;

    @Override
    public void eat() {
        System.out.println("Українець їсть");
    }

    @Override
    public void sleep() {
        System.out.println("Українець спить");
    }

    @Override
    public void speak() {
        System.out.println("Українець балакає");
    }

    @Override
    public void fire() {
        System.out.println("Українець захищає");
    }
}
