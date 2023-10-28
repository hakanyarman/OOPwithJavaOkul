public class Car {
    String brand = "Ford";
    String model;

    public  Car(String model){
        this.model = model;
    }
    int price = 2000; // dollar

    public int tlPrice(int exchange){
        return price*exchange;
    }
}
