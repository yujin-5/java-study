package chap2_2.lang;

public class Wrapper {

    private int a; //기본값 0
    private Integer b; //기본값 null

    public static void main(String[] args) {
        
        //자바는 객체지향 언어다.
        //모든 데이터를 객체로 보겠다.
        //객체 표현의 장점
        //1. 다형성 활용 가능
        //2. 메서드 추가 가능 -> 16진수 변환, 2진수 변환

        //Wrapper의 목적: 원시타입을 제거하겠다
        int a = 10; //원시 타입
        Integer b = new Integer(10); //숫자 10을 객체로 표현
        System.out.println("b = " + b);

        String s = new String(new char[]{'a','b','c'});
        String str = "abc";
        //박싱: 빈번하게 쓰이는 객체들을 쉽게 쓸 수 있게 문법적으로 처리


    }
}
