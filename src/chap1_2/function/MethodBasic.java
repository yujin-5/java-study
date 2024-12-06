package chap1_2.function;

import java.util.Scanner;

public class MethodBasic {

    //자바에서는 함수를 메서드라고 부름
    //정의 위치는 반드시 클래스 내부, 다른 메서드 외부여야 함

    //두 개의 정수를 전달받아 그 합을 반환하는 함수
//    function add (n1, n2) {
//        return n1 + n2;
//    }
    
//리턴 타입
//double합을 int로 리턴하고 싶을 때 다운캐스팅하면 됨    
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    //두 개의 정수를 전달받아 그 곱을 콘솔에 출력하는 함수
    static void printMultiply(int n1, int n2){
        if (n1 < 0) return; //void에서 return은 브레이크처럼 사용할 수 있음
        System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
    }

    //n개의 정수를 전달받아 그 총합을 반환하는 함수 -방법1
//    static int addAll (int[] numbers){
//        int total = 0;
//        for (int n : numbers) {
//            total += n;
//        }
//        return total;
//    }

    //n개의 정수를 전달받아 그 총합을 반환하는 함수 -방법2
    //스프레드 문법
    static int addAll (int...numbers){
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    //2개의 정수를 전달받아 그 사칙연산의 4가지 결과를 리턴
    static int[] operate(int n1, int n2){
        int addResult = n1 + n2;
        int subResult = n1 - n2;
        int mulResult = n1 * n2;
        int divResult = n1 / n2;
        int[] results = {addResult,subResult,mulResult,divResult};

        return results;
    }

    
    public static void main(String[] args) {
        int r1 = add(30,50);
        System.out.println("r1 = " + r1);

        printMultiply(5,4); //void함수는 변수에 집어넣으면 안 됨
        printMultiply(add(2,3), add(6,8));

        //int[] arr = new int[] {10,20,30};
        //int r2 = addAll(new int[]{10,20,30});

        int r3 = addAll(10, 20, 30, 50);

        int[] operateResults = operate(20, 5);
        System.out.println("덧셈결과: " +operateResults[0]);

        int r4 = operate(60,20)[2];
        System.out.println("r4 = " + r4);
    }
}
