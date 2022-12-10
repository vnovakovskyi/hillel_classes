package interfaces;

public class Main {

    public static void main(String[] args) {

        String name = "Ivan";
        name += " Mazepa";

        Auto [] cars = new Auto[] {
                new Lamborhiny(100, 300),
                new Porche(250)
        };

        for (Auto auto :
                cars) {
            auto.drive(150);
        }




        A a1 = new AImpl();
        a1.foo();
//        a1.bar();

        A a2 = new A2Impl();
        a2.foo();

        AImpl ai1 = new AImpl();
        ai1.foo();
        ai1.bar();

        A2Impl ai2 = new A2Impl();
        ai2.foo();

    }
}
