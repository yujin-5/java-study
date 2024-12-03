package chap1_6.modi.pac1;

//class에는 접근제한을 public과 default만 적용할 수 있음
//default 적용 시 내부 퍼플릭을 주지 않겠다는 의미
public class A {

    //필드
    public int f1;
    int f2; //default 제한자
    private int f3;

    //생성자
    public A(){
        this(10.99);
        f1 = 1;
        f2 = 2;
        f3 = 3;
        m1();
        m2();
        m3();
    }
    A(int a){} //default 제한자
    private A(double b){}

    //메서드
    public void m1(){
//        public int x = 10; //지역변수에는 접근제한자를 사용할 수 없음
    }
    void m2(){} //default 제한자
    private void m3(){}
}
