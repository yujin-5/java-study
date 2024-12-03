package chap1_8.poly;

class A {}
class B extends  A{}
class C extends  A{}
class D extends  B{}
class E extends C{}

/*
A의 부모: object
A의 자식: B와 C
B의 자식: D
C의 자식: E
A와 D, A와 E: 상속 관계
B와 C: 형제 -> 상속 관계 아님
B와 E, C와 D: 상속 관계 아님
 */

public class Basic {
    public static void main(String[] args) {
    //다형성: 객체가 다양한 형태를 가지고 있는 성질
    //             다양한 타입(부모의 타입)을 사용할 수 있음
    //전제: 상속관계에서만 가능함
    //Object는 모두의 부모이므로 지역변수 생성 시 언제든 사용할 수 있음

    // 타입        생성자
        A x1 = new A();
        A x2 = new B();
        A x3 = new C();
        B x4 = new D();
        C x5 = new E();



    }
}
