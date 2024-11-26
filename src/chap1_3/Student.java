package chap1_3;

import java.util.UUID;

public class Student {

    String studentID;
    //고유번호는 보통 문자열
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

    //생성자는 클래스명과 동일하게 만들어줘야 함
    //학생 정보 생성할 때 필요한 정보를 내노라는 의미
    Student(String nm, int grd){
        studentID = UUID.randomUUID().toString();
        //절대로 겹치지 않는 랜덤 문자
        //의미없는 랜덤 문자를 만들 때 사용함
        //랜덤으로 만들 거기 때문에 파라미터로 안 받아도 됨
        name = nm;
        grade =grd;
    }
}
