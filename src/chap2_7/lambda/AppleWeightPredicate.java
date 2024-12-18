package chap2_7.lambda;

public class AppleWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= 150; //사과 무게가 150이상인지 검사
    }
}
