package chap1_3;

public class CarMain {
    public static void main(String[] args) {

        Car morning =new Car("테슬라 모델X", "실버");
        morning.accelerate(40);
        morning.accelerate(50);
        morning.brake(30);
        morning.displaySpeed();
    }
}
