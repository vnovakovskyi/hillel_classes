package inheritence;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        System.out.println("Animals " + Animal.getAnimalCount());
        System.out.println("Dogs " + Dog.getDogCount());
        System.out.println("Cats " + Cat.getCatCount());

        dog1.run(300);
        dog2.run(400);
        dog2.swim(400);

        cat1.run(200);
        cat2.run(300);
        cat2.swim(300);
    }
}
