package chap1_3;

public class Rectangle {
    int width;
    int height;

    //생성자
    Rectangle(int w, int h){
        width = w;
        height =h;
    }

    int calculateArea(){
        return width*height;
    }

    int calculatePerimeter(){
        return (width + height) * 2;
    }

}
