 public class Constructor {
    int num; // default hali 0
    boolean isTrue; // default hali false
    String txt; // default hali null

     public Constructor(int num, boolean isTrue, String txt){
         this.num = num;
         this.isTrue = isTrue;
         this.txt = txt;
     }

     // constructor overloading
     public Constructor(){
         System.out.println("non-parameterized constructor");
     }

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

        Constructor myObj2 = new Constructor();
        System.out.println(myObj2.txt); // null
        myObj2.txt = "text";
        System.out.println(myObj2.txt.getClass().getName()); // type check => String
        System.out.println(myObj2.getClass().getName()); // type check => Constructor

        // created myObj3 reference in stack, but it does not reference any object.
        // an error happens called NullPointerException when we try to get or set a member of reference which does not reference any object.
        Constructor myObj3 = null;
        // myObj3.txt = "text";


    }

}
