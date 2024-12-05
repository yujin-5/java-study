package chap1_10.inter.animal;

//클래스 상속과 인터페이스 구현을 동시에 할 때는 상속이 우선
public class BullDog extends Animal
        implements Aggressive, Pet{

    @Override
    public void sleep() {
        Pet.super.sleep();
    }

    @Override
    public void hunt(Animal pet) {

    }

    @Override
    public void handel() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {

    }

}
