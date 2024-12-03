package chap1_8.poly.drive;

public class Sonata extends Car{
    public void accelerate(){ //소나타가 자체적으로 만든 기능이 아님. 부모가 물려준 걸 고친 것임
        System.out.println("소나타가 달립니다.");
    }

    public void joinSonataClub(){ //소나타의 자체적 기능
        System.out.println("소나타 동호회에 가입합니다.");
    }
}
