package practice.hongongja.sec06.exam06;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getSpeed());

        myCar.setSpeed(60);
        if(!myCar.isStop()){
            myCar.setStop(true);
        }

        System.out.println("현재 속도: " + myCar.getSpeed());

        Car myCar2 = new Car();
        myCar2.setStop(false);
        System.out.println(myCar2.isStop());
        System.out.println(myCar2.getSpeed());


    }
}
