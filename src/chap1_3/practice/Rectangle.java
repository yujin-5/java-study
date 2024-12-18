package chap1_3.practice;

public class Rectangle {

    //필드
    int width;
    int height;

    //생성자
    Rectangle(int w, int h){
        width = w;
        height = h;
    }

    //메서드
    //#1. 넓이 계산
    int calculateArea(){
         return width*height;
    }

    //#2. 둘레 계산 
    int calculatePerimeter(){
        return (width + height) * 2;
    }

    public static void main(String[] args) {
        Rectangle square1 = new Rectangle(20,30);
        int area = square1.calculateArea();
        int peri = square1.calculatePerimeter();
        System.out.println("area = " + area);
        System.out.println("peri = " + peri);

    }
}
