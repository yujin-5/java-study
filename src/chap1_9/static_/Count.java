package chap1_9.static_;

public class Count {

    //접근제한자 - 클래스, 필드, 메서드, 생성자에 붙일 수 있음
    //사용제한자
    //사용제한자는 접근제한자와 같이 사용 가능
    //static: 필드, 메서드, 내부 클래스
    //final:
    //abstract

    //정적 필드는 모든 객체가 공유하는 데이터
    //new Count() 10번하면
    //y는 메모리에 10개 생성, x는 여전히 1개
    static int x; //정적 필드
    int y;        //인스턴스 필드 (동적)

    //정적 메서드: 모든 객체가 공유하는 기능
    //객체 생성없이 호출 가능
    static void m1(){
        System.out.println("static mathod call!");
        //System.out.println(this); //static은 this가 없음

        //static메서드 안에서는 인스턴스 필드를 참조할 수 없음
        System.out.println("x = " + x);
        //System.out.println("y = " + y);
    }
    //인스턴스 메서드: 객체별로 따로 행동하는 기능
    //호출 시 객체가 먼저 생성되어 있어야 함
    void m2(){
        System.out.println("instance method call!");
        System.out.println(this);

        System.out.println("x = " + x);
        System.out.println("y = " + y); //c1.m2() -> this: c1
                                        //c2.me() -> this: c2
                                        //m2는 this를 앎으로 y를 사용할 수 있음
    }

}
