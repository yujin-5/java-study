package chap1_3;

public class StudentMain {
    public static void main(String[] args) {


        Student kim = new Student("김초코", 4);
        kim.printStudentInfo();
        kim.updateGrade(6);
        kim.printStudentInfo();

    }
}
