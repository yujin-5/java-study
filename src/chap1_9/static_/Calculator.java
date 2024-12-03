package chap1_9.static_;

public class Calculator {

    String color; //계산기 색상
    static double pi; //원주율

    //계산기의 커스텀 색상을 추가하는 메서드
    //김철수 계산기에 무지개 색을 추가하세요
    //this가 나와야 하므로 static붙이면 안 됨
    void customColorize(String color){
        this.color = color;
    }

    //원의 넓이를 계산하는 메서드
    //this가 필요없으면 static 붙여도 됨
    static double calcArea(int r){
        return pi*r*r;
    }

}
