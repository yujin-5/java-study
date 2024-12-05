package chap2_1.exception;

public class FinallyExample {
    public static void main(String[] args) {
        String[] pets = {"멍멍이","야옹이","비둘긔"};
        for (int i = 0; i <5 ; i++) {
            try {
                System.out.println(pets[i] + " 키울래요~");
            } catch (Exception e) {
                System.out.println("그런 애완동물은 없어요~");
            } finally {
                //예외 발생 여부와 상관없이 반드시 실행되는 코드
                //일반적으로 메모리 정리 차원에서 사용하는 경우가 많음
                //ex. 데이터베이스 연결하거나 네트워크 연결할 때
                //자바에서 업데이트되면서 오토클로저블 기능이 생겨서 finally 잘 안 씀
                System.out.println("애완동물 화이팅!");
            }
        }
        System.out.println("111");
    }
}

