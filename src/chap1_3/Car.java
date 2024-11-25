package chap1_3;

public class Car {
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
}
