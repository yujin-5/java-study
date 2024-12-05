package chap2_3.generic;

//뭘 담을지는 모르겠지만 아무튼 바구니
//F를 담을건데 F는 바구니가 만들어질 때 결정됨
public class Basket<F extends Fruit> {

    //F: 제네릭 타입 - 설계 당시에는 정확한 타입이 없는 상태
    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }
}
