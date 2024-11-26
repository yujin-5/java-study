package chap1_3;

public class RectangleMain {
    public static void main(String[] args) {
        //타입 선언            객체 생성  
        Rectangle square =new Rectangle(20,30);
        //ctrl + p누르면 괄호 안에 뭐 넣어야 하는지 알려줌
        int area = square.calculateArea();
        System.out.println("area = " + area);
        int peri = square.calculatePerimeter();
        System.out.println("peri = " + peri);
    }
}
