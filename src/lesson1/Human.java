package lesson1;

public interface Human extends SportsMan, TestInt {
    default void eat(){
        System.out.println("Default");
    }
    void sleep();
    default void run() {
        System.out.println("Default run");
    }
    void speak();
    void fire();
}
