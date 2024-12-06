package chap2_4.collection.practice;

import java.util.*;

public class StudentManagementExample {
    public static void main(String[] args) {
        List<String>studentNames = new ArrayList<>();
        studentNames.add("홍길동");
        studentNames.add("이순신");
        studentNames.add("강감찬");
        studentNames.add("홍길동");

        System.out.println("학생들의 이름: " + studentNames);

        Set<String> uniqueNames = new HashSet<>(studentNames);
        System.out.println("중복되지 않은 학생들의 이름: " + uniqueNames);
    }
}
