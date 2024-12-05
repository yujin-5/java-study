package chap2_1.exception;

public class TryExample1 {
    public static void main(String[] args) {

        try {
            int n1 = 10;
            int n2 = 0;

            System.out.println("나눗셈 시작!");

            int result = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, result);

        } catch (Exception e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("나눗셈 종료!");
    }
}

//예외 처리
//1. if~else문 (개발자가 예외 상황 인지했을 때 사용 가능)
//2. try~catch문 (개발자가 예외 상황 인지하지 못했을 때 사용 가능)
//try블록: 예외가 발생할 가능성이 있는 코드를 포함함
//catch블록: 발생한 예외를 처리하는 코드를 포함함
//진행 순서: try코드 시행 중에 예외가 발생하면 즉시 catch로 이동하여 후속 처리를 진행함