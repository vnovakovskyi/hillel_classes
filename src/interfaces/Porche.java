package interfaces;

public class Porche implements Auto {

    int maxSpeed;

    public Porche(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive(int speed) {
        if(speed <= maxSpeed) {
            System.out.println("hurrrrayyy!");
        } else {
            System.out.println("Keep it easy!");
        }
    }

    @Override
    public void stop() {

    }
}
