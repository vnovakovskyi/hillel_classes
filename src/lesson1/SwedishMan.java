package lesson1;

public class SwedishMan implements Human {

    @Override
    public void eat() {
        System.out.println("Швед їсть");
    }

    @Override
    public void sleep() {
        System.out.println("Швед спить");
    }

    @Override
    public void run() {
        System.out.println("Швед бігає");
    }

    @Override
    public void speak() {
        System.out.println("Швед балакає");
    }

    @Override
    public void fire() {
        System.out.println("Швед захищає");
    }

    @Override
    public void doSport() {

    }
}
