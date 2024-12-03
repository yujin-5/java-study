package chap1_9.practice.q1;

public class Car {

    //필드
    private String model; //자동차 모델명
    private int year; //제조년도
    static int count; //생산된 자동차의 총 개수

    //생성자
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        count++;
    }

    //메서드
    void getCarinfo(){
        System.out.println("model = " + model);
        System.out.println("year = " + year);
    }

    static void getTotalCars(){
        System.out.println("count = " + count);
    }


}
