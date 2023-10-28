public class This {
    int x;

    public int func(int x){
        // it returns x which is parameter
        return x;
    }

    public int func2(int x){
        // it returns x which in the class field. because the "this" keyword refers to object that is created from the class
        return this.x;
    }
}
