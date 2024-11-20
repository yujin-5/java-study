package chap1_2;

public class Casting {
    public static void main(String[] args) {
        //타입 캐스팅
        //타입이 다르면 연산 불가
        //묵시적 형 변환: 작은 데이터를 큰 공간에 넣을 때는 자동 변환이 발생함
        byte a = 100; //1바이트
        int b = a; //4바이트
        System.out.println("b = " + b);
        
        //큰 데이터를 작은 공간에 넣을 때는 명시적으로 변환을 하면 데이터가 손실될 수 있음
        //1000중에 127만 가지고 가면 되는 거 아니야? No
        //1000을 이진수로 변환하면
        // 00000011 11101000

        int c = 1000; //4바이트
        // 1 1101000 :양수로 해석하면 104
        // 1의 보수: 비트를 반전
        // 1101000 -> 0010111
        // 2의 보수: 1을 더함
        // 0010111
        //+      1
        // 0011000: 24
        byte d = (byte) c; //1바이트
        System.out.println("d = " + d); //-24
        
        int k = 50; //4바이트: 정수
        double j = k; //8바이트: 실수
        System.out.println("j = " + j); //50.0
        
        double m = 5.567;
        int n = (int)m;
        System.out.println("n = " + n); //5 -> 소수점 이하가 날라감 -> 소수점을 버리고 싶을 때 의도적으로 사용할 수도 있음
        
        //묵시적 형 변환 = upcasting (promotion)
        //명시적 형 변환 = downcasting 
        
        //타입이 다른 연산의 경우 큰 쪽에 맞춰서 자동 캐스팅
        int v = 9; //4바이트: 정수
        double z = 6.6; //8바이트: 실수
        double result = v + z;
        System.out.println("result = " + result); //106.6

        char result2 = (char) ('A' + v);
        System.out.println("result2 = " + result2); //J: ??뭥미..
        
        int result3 = 27/5;
        System.out.println("result3 = " + result3); //5: 몫만 출력
        
        double result4 = 27 / 5.0; //27.0 /5여도 동일한 값 나옴
        System.out.println("result4 = " + result4); //5.4: 몫과 나머지 출력

        //int보다 작은 데이터의 연산은 모두 강제로 int로 변환됨
        //byte + byte = int
        //char + char = int
        //int + int = int
        //int + double = double
        byte b1 = 100;
        byte b2 = 20;
        int b3 = b1 + b2;
    }
}

