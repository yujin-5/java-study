package chap1_6;

public class Main {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();

        //1.버튼 누름
        //2.엔진 오일 분사
        //3.실린더 움직임
        //4.시동 걸림

        //버튼만 누르면 나머지 알아서 됐으면 좋겠음 => 캡슐화 필요
        //버튼 누르는 기능에 나머지 기능을 캡슐로 감싸면 됨
        //버튼 누르는 것만 접근제한자 public 부여, 나머지는 private 부여
        //-> 함수에 다른 내부적인 기능들을 넣어놓고 사용자에게 숨겨놓는 게 캡슐화

        myCar.pressStartButton();

        //변속 수행
        myCar.setMode("N");
        System.out.println("현재 모드: " + myCar.getMode());

        //정보 은닉의 핵심은 사용자를 믿지 못하는 것 => 건드리지마 => 필드에 private 부여
        //필드 값을 풀어놓으면 사용자가 어떤 값을 넣을지 모름
        //대리인을 만듦 = setter => 조건문 쓸 수 있으므로
        //대리인이 값을 전달받아서 검사해줌

        //지금은 모든 필드를 private을 넣는게 관례처럼 됨 -> 의미없이 세터, 게터 만듦

    }
}
