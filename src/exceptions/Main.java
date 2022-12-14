package exceptions;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int res = 0;

        try {
            res = calc(a, b);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }

        System.out.println(res);
    }

    private static int calc(int a, int b) throws FileNotFoundException {
        if (b < 0) throw new IllegalArgumentException("Відʼємні числа не підтримуються");
        bar();
        return a / b;
    }

    private static void bar() throws FileNotFoundException {
        throw new SpotifyUserException("My User exception");
    }
}
