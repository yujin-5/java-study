package chap1_2;

import java.util.Scanner;

public class StandardIO {
    public static void main(String[] args) {

        //자바의 출력
        //print는 줄 바꿈 안 해줌
        //println은 줄 바꿈 해줌
//        System.out.print(123);
//        System.out.print(456);

        //자바의 입력
//        int data = System.in.read(); //입력 데이터의 아스키 코드를 반환함 -> 사용하지 말 것
//        System.out.println(data);
        Scanner sc = new Scanner(System.in);
        //입력 처리
        System.out.print("이름: ");
        String data = sc.nextLine();
        System.out.println("data = " + data);
        
        //정수 입력 처리
        System.out.print("나이: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("age = " + age);

    } //end main
}
