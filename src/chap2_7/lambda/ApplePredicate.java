package chap2_7.lambda;

public interface ApplePredicate {
    //사과를 전달받아 특정 조건에 의해 사과를 필터링
    boolean test(Apple apple); //사과를 주면 특정 조건으로 검사해서 결과를 true, false로 알려줄게
    //검사하는 동작을 만들어놓고 동작을 추상화시킴
    //왜냐면 검사 종류가 수없이 많기 때문


}
