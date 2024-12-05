package chap1_10.inter.animal;

public interface Pet {

    void handel();
    boolean inject();

    //뒤늦게 추상 메서드를 추가할 때는 "default키워드 {}" 사용
    //나중에 시간날 때 수동으로 오버라이딩하라는 의미
    //바로 수정하지 않아도 됨
    //수정 다 했으면 "default키워드랑 {}"를 빼면 됨
    default void sleep() {} //갑자기 추가하는 순간 고쳐야 하는 클래스가 많아짐(불독, 캣, 덕)
}
