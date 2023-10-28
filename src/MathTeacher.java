public class MathTeacher extends Teacher {
    public String currentMathSubject;
    public String department = "math";

    public MathTeacher(int salary, int graduationYear, boolean isMarried , String currentMathSubject){
        super(salary,graduationYear,isMarried);
        this.currentMathSubject = currentMathSubject;
    }

    public static void main(String[] args){
        MathTeacher ali = new MathTeacher(25000,2018,false,"functions");
        ali.teach();
        System.out.println(ali.department + " " + ali.currentMathSubject);
    }
}
