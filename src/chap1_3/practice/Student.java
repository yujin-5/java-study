package chap1_3.practice;

import java.util.UUID;

public class Student {

    //필드
    String studentId;
    String name;
    int grade;

    //생성자
    Student(String name, int grade){
        studentId = UUID.randomUUID().toString();
        this.name = name;
        this.grade = 1;
    }

    //메서드
    void updateGrade(int newGrade){
        grade = newGrade;
    }

    void printStudentInfo(){
        System.out.println("studentId = " + studentId);
        System.out.println("name = " + name);
        System.out.println("grade = " + grade);
    }

    public static void main(String[] args) {
        Student park = new Student("ms.park",5);
        park.updateGrade(6);
        park.printStudentInfo();

    }

}
