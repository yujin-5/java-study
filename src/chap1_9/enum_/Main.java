package chap1_9.enum_;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.orderPizza();
//        pizza.readyPizza();
//        pizza.deliverPizza();

        //현재 주문 상태 확인해보고자 함
        System.out.println("주문 상태: " + pizza.getStatus());


    }
}
