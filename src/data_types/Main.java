package data_types;

public class Main {

    public static void main(String[] args) {
//        int i = 5;
//        System.out.println(i);
//
//        i = changePrVariable(i);
//
//        System.out.println(i);


//        int[] arr = new int[]{1,2,3};
//        System.out.println("arr created");
//        for (int i :
//                arr) {
//            System.out.printf(i + " ");
//        }
//        System.out.println("--------------");
//
//        changeArrVariable(arr);
//
//        System.out.println("arr changed");
//        for (int i :
//                arr) {
//            System.out.printf(i + " ");
//        }
//        System.out.println("-------end-------");


        String name = "Ivan";
        System.out.println(name);

        changeStringVariable(name);

        System.out.println(name);
    }

    private static void changeStringVariable(String s) {
        s += " Mazepa";
        System.out.println(s);
    }

    private static int changePrVariable(int i) {
        i++;
        System.out.println(i);
        return i;
    }

    private static void changeArrVariable(int[] arr) {
        System.out.println("arr in method");
        if (arr.length > 1) {
            arr[0] = arr[0] + 1;
        }

        for (int i : arr) {
            System.out.printf(i + " ");
        }
        System.out.println("--------------");
    }
}
