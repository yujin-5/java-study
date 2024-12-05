package chap1_7.overloading;

public class Example {

    //오버로딩: 같은 클래스 안에서 이름이 같은 메서드를 여러 개 선언하는 것
    //룰1. 메서드 이름만 같고 파라미터의 타입이 달라야 함 -> 파라미터 순서가 다르거나 타입이 다르거나 하면 ok
    //룰2. 리턴 타입은 영향을 미치지 않음

    void add(int x, double y){
    }
    void add(double x, int y){
    }

    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, double n2){
        return n1 +n2;
    }
    public String add(String n1, String n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.add(10,20);
    }

}
