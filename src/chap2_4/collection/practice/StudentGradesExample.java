package chap2_4.collection.practice;

import java.util.*;

public class StudentGradesExample {
    public static void main(String[] args) {
        Map<String, Integer>studentGrades = new HashMap<>();
        studentGrades.put("홍길동",85);
        studentGrades.put("이순신",90);
        studentGrades.put("강감찬",78);

        System.out.println("학생 성적: " + studentGrades);

        //특정 학생의 성적 조회
        String student = "이순신";
        int grade = studentGrades.get(student);
        System.out.println(student + "의 성적: " + grade);
    }
}
