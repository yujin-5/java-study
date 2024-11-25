package chap1_3;

public class Student {

    int studentID;
    String name;
    int grade;

    void updateGrade(int newGrade){
        grade = newGrade;
    };

    void printStudentInfo(){
        System.out.println(studentID);
        System.out.println(name);
        System.out.println(grade);
    }

    Student(){
        studentID = 1234;
        name = "김학생";
        grade = 5;

    }

}
