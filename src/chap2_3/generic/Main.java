package chap2_3.generic;

public class Main {
    public static void main(String[] args) {

        //제네릭을 사용하지 않았을 때
        //과일 전용 바구니를 일일히 설계해야 함
        //사과 바구니 생성
        AppleBasket appleBasket = new AppleBasket();
        //사과 바구니에 사과 담기
        appleBasket.setApple(new Apple(10));
        Apple apple = appleBasket.getApple();
        System.out.println("apple = " + apple);

        //바나나 바구니 생성
        BananaBasket bananaBasket = new BananaBasket();
        bananaBasket.setBanana(new Banana(7));
        Banana banana = bananaBasket.getBanana();
        System.out.println("banana = " + banana);

        //제네릭을 사용했을 때
        //바구니 설계도는 1개만 만들고 바구니 생성 시 전용 과일을 지정
        //사과 전용 바구니
        Basket<Apple> ab = new Basket<Apple>();
        ab.setFruit(new Apple(33));
        Apple apple2 =  ab.getFruit();

        //바나나 전용 바구니
        Basket<Banana> bb = new Basket<>();
        bb.setFruit(new Banana(22));
        Banana banana2 = bb.getFruit();

        //복숭아 전용 바구니
        Basket<Peach> peachBasket = new Basket<>();
        peachBasket.setFruit(new Peach());

        //과일들만 담겼으면 좋겠음
        //고양이 전용 바구니는 안 만들고 싶음
        //프룻트 인터페이스를 만듦

//        Basket<Cat> catBasket = new Basket<>();
    }



}
