package practice.dec03_1;

public class Circle extends Shape {
    private double radius; //반지름

    //생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    //메서드
    public double area(){
        return (radius*radius*3.14);
    }

    public double perimeter(){
        return (2*3.14*radius);
    }

}
