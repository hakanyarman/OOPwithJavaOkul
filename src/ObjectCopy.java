import javax.management.ObjectName;

public class ObjectCopy {
    public int x = 10;

    public static void main(String[] args){
        // shallow copy => referans tipindekilerde.
            ObjectCopy obj1 = new ObjectCopy();
            ObjectCopy obj2 = obj1;
            obj1.x = 5;
            System.out.println(obj2.x + " " + obj1.x);
        obj2.x = 8;
        System.out.println(obj2.x + " " + obj1.x);
        // birinde yaptığımız değişiklik ikisini de etkiliyor.
        //-------------------------------------------------------------
        ObjectCopy obj3 = new ObjectCopy();
        ObjectCopy obj4 = new ObjectCopy();
        obj3.x = 7;

        System.out.println(obj3.x + " " + obj4.x);
        //-------------------------------------------------------------

        // deep copy => değer tipindekilerde

        String txt = "merhaba";
        String txt2 = txt;
        txt = "selam";
        System.out.println(txt2); // merhaba döndürür. çünkü txt'deki değişiklik txt2 yi etkilemez.

        ABC abc1 = new ABC();
        ABC abc2 = new ABC();
        abc1= abc2;
        abc2 = abc1;
        ABC abc3 = abc1;
        abc1 = abc2;
        abc2 = abc1;
        abc1 = abc1;





    }
}

class ABC{
    public int a = 8;
}
