package chap1_9.static_;

public class Main {
    public static void main(String[] args) {

        Count.x =10; //"클래스이름.필드명"으로 접근하면 됨
        Count.m1();

        //객체 생성
        Count c1 = new Count();
        Count c2 = new Count();

        c1.m2();
        c2.m2();


    }
}
