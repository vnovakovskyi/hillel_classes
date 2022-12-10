package interfaces;

public class AImpl implements A {

    public int status = 10;

    @Override
    public void foo() {
//        maxDistance = 1000;
        System.out.println("foo()");
    }

    public void bar() {
        System.out.println("bar()");
    }
}
