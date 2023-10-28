import java.util.Scanner;

public class Comparison {

    public static void main(String[] args){
        compareNumbers();
    }

    public static void compareNumbers(){
        Scanner scanner = new Scanner(System.in);

        int num1,num2;
        System.out.println("Enter the 1st number");
        num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number");

        num2 = scanner.nextInt();


        if (num1 == num2){
            System.out.println("eşit");
        }
        else{
            System.out.println("eşit değil");
        }

    }
}
