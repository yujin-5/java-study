package chap2_7.lambda;

import java.util.List;

import static chap2_7.lambda.Color.RED;
import static chap2_7.lambda.FilterApple.*;

public class Main {
    public static void main(String[] args) {

        //사과 바구니를 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN)


        );

        List<Apple> greenApples = filterGreenApples(appleBasket);
        System.out.println("greenApples = " + greenApples);

        System.out.println("=================================");

        List<Apple> weightGT150 = filterApples(appleBasket, new AppleWeightPredicate());
        System.out.println("weightGT150 = " + weightGT150);

        //인터페이스는 객체가 아님. 객체를 생성해서 파라미터로 보낼 수 없음
        //인터페이스를 구현한 다른 클래스를 보내면 됨

        //빨강색이면서 무게가 150미만인 사과를 필터링하기 위해서는
        //조건 검사를 위해서 클래스를 하나 더 만들어야 함
        filterApples(appleBasket,new AppleSomething());

        //색상이 빨강색이거나 녹색인 사과를 필터링하기 위해서는
        List<Apple> applesGorR = filterApples(appleBasket, new AppleGreenOrRed());
        System.out.println("applesGorR = " + applesGorR);

        //익명클래스 활용
        //빨강색이면서 100이상 사과를 필터링
        List<Apple> redHeavyApples = filterApples(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED && apple.getWeight() > 100;
            }
        });
        System.out.println("redHeavyApples = " + redHeavyApples);

        //음식 목록 중 세글자인 필터링만 필터링
        List<String> foods = List.of("짜장명", "우동", "김치찌개");
        filter(foods, (f)-> f.length() ==3);



    }
    //내부 클래스
    private static class AppleGreenOrRed implements ApplePredicate{

        @Override
        public boolean test(Apple apple) {
            return apple.getColor() == RED || apple.getColor() == Color.GREEN;
        }
    }
}
