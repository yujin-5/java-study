package chap1_9.practice.q3;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("apple", 1500);
        Product grape = new Product("grape", 6000);

        apple.getDiscountedPrice(); //1350원
        grape.getDiscountedPrice(); //5400원

    }
}
