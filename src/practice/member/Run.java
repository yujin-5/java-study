package practice.member;

//프로그램의 실행을 담당하는 클래스
public class Run {
    public static void main(String[] args) {
        MemberController mc = new MemberController();
        mc.start();
    }
}

//나이에 숫자가 아닌 문자를 입력했을 때 프로그램이 튕김 -> 고객들의 신뢰도를 잃을 수 있음
//프로그램 내부 오류: 예외
//예외 상황 처리를 해줘야 함(12.05)