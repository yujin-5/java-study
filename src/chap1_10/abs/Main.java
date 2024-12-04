package chap1_10.abs;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        Cat myCat = new Cat();

        //Pet pet = new Pet(); //추상적인 객체
        //도그와 캣을 묶어주기 위한 껍데기에 불과한 클래스 = 추상 클래스
        //객체 생성을 못하게 할 수 있음 -> abstract

        Pet[] petList = {myDog, myCat,new GoldFish()};

        //오버라이드가 적용될려면 부모 클래스에도 eat 메서드가 있어야 함
        for (Pet pet : petList) {
            pet.eat();
        }
    }
}
