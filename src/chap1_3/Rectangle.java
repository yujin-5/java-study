package chap1_3;

public class Rectangle {
    int width;
    int height;

    Rectangle(){
        width = 10;
        height = 10;
    }

    void calculateArea(){
        System.out.println(width*height);
    }

    void calculatePerimeter(){
        System.out.println(2*(width+height));
    }

}
