 public class Constructor {
    int num; // default hali 0
    boolean isTrue; // default hali false
    String txt; // default hali null

    static void sayHello(){
        System.out.println("Hello");
    }

    public void sayHi(){
        System.out.println("Hi");
    }

    public static void main(String[] args){
        Constructor myObj = new Constructor();
        myObj.num++; // 0 dı 1 arttı ve 1 oldu.
        System.out.println(myObj.num + " " + myObj.isTrue + " " + myObj.txt);


    }

}
