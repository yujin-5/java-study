package chap1_9.practice.q3;

public class Product {

    private String productName;
    private int price;
    private static final double DISCOUNT_RATE = 0.1 ;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    void getProductInfo(){
        System.out.println("productName = " + productName);
        System.out.println("price = " + price);
    }

    int getDiscountedPrice(){
        return (int) (price*(1-DISCOUNT_RATE));
    }


}
