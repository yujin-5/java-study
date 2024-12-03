package chap1_8.poly.computer;

public class Computer {

    //필드: 객체의 속성 - 객체를 이루고 있는 데이터
    //삼성 키보드만 쓸 수 있다 => 교환성이 낮고 결합도가 강해진다
    //=> 이 문제를 해결하기 위해 다형성이 존재함
    //Object사용 시 호환성이 좋아짐
    //Object남발하는 것보다 가까운 부모 타입을 사용해주는 게 좋음
    //*다형성은 객체의 교환성을 높여주어 객체가 특정 객체에 종속(의존)되지 않도록 하게 해줌
    Keyboard keyboard;

    //키보드를 교체하는 기능
    public void changeKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
        System.out.println("키보드가 교체되었습니다.");
    }
}
