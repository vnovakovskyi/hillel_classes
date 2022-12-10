package interfaces;

public class Lamborhiny implements Auto {

    int maxSpeed;
    int minSpeed;

    public Lamborhiny(int maxSpeed, int minSpeed) {
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }

    @Override
    public void drive(int speed) {
        if (speed < minSpeed) {
            System.out.println("Hurry up!!!");
        } else if(speed <= maxSpeed) {
            System.out.println("hurrrrayyy!");
        } else {
            System.out.println("Clear your number.");
        }
    }

    @Override
    public void stop() {

    }
}
