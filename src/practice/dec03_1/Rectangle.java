package practice.dec03_1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area(){
        return this.width * this.height;
    }

    public double perimeter(){
        return (this.width + this.height)*2;
    }



}
