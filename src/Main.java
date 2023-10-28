
public class Main {

    public static int calcAge(int birthYear, int currentYear){
           return currentYear-birthYear;
    }

    public static String introduceYourself(String fname,String lname) {
        return fname + " " + lname + " " + calcAge(2002,2023);
    }

    // fname and lname are parameters.

    public static void main(String[] args) {
        Comparison.compareNumbers();
        System.out.println("Hello world!");
        String arr[] = {"hakan","emre","hasan","enes"};
        for (String name: arr) {
            System.out.println(name);
        }
        System.out.println(calcAge(2002,2023));
        System.out.println(introduceYourself("Hakan", "Yarman"));

        // Hakan and Yarman are arguments.

        // birthYear and currentYear are parameters;
        // 2002 and 2023 are arguments.

        //-------------------------------------------------------------------------

        Car ford1 = new Car("Ford Focus"){

        };
        System.out.println(ford1.model + " " + ford1.brand + " " + ford1.tlPrice(25));

    }
}