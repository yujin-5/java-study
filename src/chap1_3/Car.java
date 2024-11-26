package chap1_3;

import java.time.LocalDate;

public class Car {
    String model;
    String color;
    int year;
    int speed;

    void accelerate(int increment){
        speed+=increment;
    }
    void brake(int decrement){
        speed-=decrement;
    }
    void displaySpeed(){
        System.out.println(speed);
    }

    //생성자
    //처음에 자동차가 생성될 때 수행할 일들
    Car(String modelName, String colorName){
        model = modelName;
        color = colorName;
        year = LocalDate.now().getYear(); //올해 연도
//        speed = 0; int의 기본값이 0이므로 입력 생략해도 됨
    }
}
