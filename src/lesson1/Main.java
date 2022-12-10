package lesson1;

public class Main {

    public static void main(String[] args) {
        Human manUkr = createHuman("укр");
        Human manSe = createHuman("se");

        manUkr.eat();
        manUkr.run();
        manSe.sleep();
        manSe.run();
    }

    private static Human createHuman(String nationality) {
        if (nationality.equals("укр")) {
        return new UkrainianMan();
        } else if (nationality.equals("se")) {
            return new SwedishMan();
        }
        return null;
    }
}