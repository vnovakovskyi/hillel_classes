package exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int res = 0;
        int operandA;
        int operandB;

        operandA = getIntegerNumberFromConsole("Enter first operand please");
        operandB = getIntegerNumberFromConsole("Enter second operand please");

        res = sum(operandA, operandB);
        System.out.println(res);


//        int a = 2;
//        int b = 0;
//        int res = 0;
//
//        try {
//            res = calc(a, b);
//        } catch (IllegalArgumentException ex) {
//            ex.printStackTrace();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally block");
//        }
//
//        System.out.println(res);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int getIntegerNumberFromConsole(String message) {
        System.out.println(message);

        Scanner input = new Scanner(System.in);
        String numberStringFormat = input.nextLine();

        int numberIntegerFormat = 0;

        try {
            numberIntegerFormat = Integer.parseInt(numberStringFormat);
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
            return getIntegerNumberFromConsole(message);
        }

        return numberIntegerFormat;
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
