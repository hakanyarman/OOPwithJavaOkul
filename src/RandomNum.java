import java.util.Random;

public class RandomNum {
    public static void main(String[] args){
        Random random = new Random();
        System.out.println(random.nextInt(10)); // 0 to 9
        System.out.println(random.nextInt(10)+1); // 1 to 10
    }

}
