package symbols;

public class Main {

    public static void main(String[] args) {
//        String name = "Anton";
//        System.out.println(name.length());

//        System.out.println(
//                name.charAt(name.length()-1)
//        );

//        System.out.println(name.substring(2, 3));
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//
//        System.out.println(name);

//        String name = "Vasyl";
//        String friend = "VASYL";
//
//        System.out.println(name == friend);
//        System.out.println(name.equalsIgnoreCase(friend));


//        String company = " ";
//        System.out.println(company.isEmpty());
//        System.out.println(company.isBlank());

//        String car = "   BMW as    ";
//        String car1 = "MB";
//        System.out.printf(car);
//        System.out.println(car1);
//
//        System.out.printf(car.trim());
//        System.out.println(car1);
//
//        String car3 = "MB";
//
//        System.out.println(car3.replace("M", "L"));


        StringBuilder builder = new StringBuilder("Anton");
        builder.append(" Antonov");
        builder.insert(5, " Antonovich");

        System.out.println(builder);

    }
}
