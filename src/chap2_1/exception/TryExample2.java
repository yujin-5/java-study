package chap2_1.exception;

import javax.script.ScriptContext;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("정수1: ");
            String str1 = sc.nextLine(); //정수를 문자열로 입력받음
            int n1 = Integer.parseInt(str1); //문자열 정수를 정수로 변환

            System.out.println("정수2: ");
            String str2 = sc.nextLine(); //정수를 문자열로 입력받음
            int n2 = Integer.parseInt(str2); //문자열 정수를 정수로 변환

            int result = n1 / n2;
            System.out.println("result = " + result);
            // Exception: 예외 위치, 예외 원인 등의 정보를 담은 객체
            // 예외의 메타데이터를 저장하는 클래스
            // catch에 특정 에러 클래스를 적으면 해당 에러만 잡고 다른 유형의 에러는 못 잡음
            //   변수타입   변수명
        } catch (NumberFormatException e) {
            //System.out.println(e.getMessage()); //추상적인 오류 메시지 -> e.getMessage를 사용해도 고객 입장에서는 아직 추상적임
            //e.printStackTrace(); //예외 상황에서 나오는 로그를 볼 수 있음
            System.out.println("정수를 정확하게 입력해주세요.");
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        } System.out.println("프로그램 정상 종료!");
    }
}

//멀티플 캐치: 여러 개의 catch블록을 사용하여 다양한 예외를 처리할 수 있음