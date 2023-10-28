public class Teacher {
    public int salary,graduationYear;
    public boolean isMarried;

    public Teacher(int salary, int graduationYear, boolean isMarried){
        this.salary = salary;
        this.graduationYear = graduationYear;
        this.isMarried= isMarried;
    }

    public void teach(){
        System.out.println("i am teaching");
    }


}
