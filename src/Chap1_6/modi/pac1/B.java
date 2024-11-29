package Chap1_6.modi.pac1;

public class B {

    B(){
        A a = new A(); //public
        new A(50); //default
//        new A(9.9); //private-같은 패키지여도 접근 불가

        a.f1 = 10; //public
        a.f2 = 11; //default
//        a.f3 = 20; //private

        a.m1();
        a.m2();
//        a.m3(); //private
    }

}
