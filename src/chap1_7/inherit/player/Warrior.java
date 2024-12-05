package chap1_7.inherit.player;

//상속을 받는 클래스 => 하위 클래스, 자식 클래스 (sub class)
//상위 클래스로부터 필드와 메서드를 상속받는 클래스
public class Warrior extends Player {
    //직업 개별 속성
    int rage; //분노 게이지

    //플레이어의 생성자를 워리어가 호출할 수만 있다면
    //코드 세 줄을 안 쓸 수 있음
    public Warrior(String ninkname) {
        // super(): 부모의 생성자 호출
        // super()는 this()와 같이 못 씀
        super(ninkname);
        this.rage = 100;
    }

    //오버라이딩: 부모가 물려준 메서드가 자식에게 적합하지 않아
    //자식이 고쳐쓰는 행위
    //룰: 부모가 몰려준 모양(리턴 타입, 이름, 파라미터)은 유지해야 함
    @Override //안전하게 오버라이딩할 수 있게 룰을 체크해줌 => "@Override"를 붙이는게 안전한 코딩 방법임
    public void showStatus(){
        super.showStatus();
        System.out.println("# 분노: " + rage);
    }

    //직업 개별 기능
    //전사 스킬
    public void dash() {
    }


}
//직업이 300개라고 할 때
//level을 없애는 작업을 수행하면 300번 해야 함
//상속: 공통 속성과 공통 기능을 하나의 클래스에 모아서 관리하는 것