package chap1_10.inter.animal;

public class Main {
    public static void main(String[] args) {

        //다중 상속의 문제를 인터페이스가 해결함
        //기능을 명세한다, 규격화한다 -> 인터페이스 활용
        BullDog bullDog = new BullDog(); //타입의 확장성이 넓어짐
                                        //인터페이스를 타입으로도 활용 가능
                                        //불독 -> 와일드 타입, 헌터블 타입, 펫 타입 사용 가능
        bullDog.handel();
        bullDog.inject();
        bullDog.violent();


    }
}
