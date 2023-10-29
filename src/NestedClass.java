class OuterClass{

    public String txt = "Text";
    class InnerClass{
        public String txt2 = "Text2";
        public String getMemberOfOuterClass(){
            return txt;
        }

        static class InnerInnerClass{
            public String txt3 = "Text3";
        }
    }
}



public class NestedClass {
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass =  outerClass.new InnerClass();
        System.out.println(outerClass.txt + " " + innerClass.txt2);
        // this gets member of outerclass from innerclass.
        System.out.println(innerClass.getMemberOfOuterClass());
        // InnerInnerClass'ı static yaptığımız için üst sınıftan object oluşturmadan InnerInnerClass'ın memberına ulaşabiliyoruz.
        OuterClass.InnerClass.InnerInnerClass innerInnerClass = new OuterClass.InnerClass.InnerInnerClass();
        System.out.println(innerInnerClass.txt3);
    }
}
