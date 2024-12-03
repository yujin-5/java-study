package chap1_9.practice.q1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("morning", 2024);
        Car car2 = new Car("pony", 1999);

        car1.getCarinfo();
        car2.getCarinfo();

        Car.getTotalCars();

    }
}
