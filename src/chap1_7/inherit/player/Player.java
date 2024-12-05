package chap1_7.inherit.player;

//상속을 위한 공통 속성과 공통 기능을 가진 부모 클래스 (super class, 상위 클래스)
public class Player {

    //공통 속성
    String ninkname;
    int level;
    int hp;

    public Player(String ninkname) {
        this.ninkname = ninkname;
        this.level = 1;
        this.hp = 50;
    }

    //공통 기능
    public void showStatus(){ //=> 시그니처 (제한자, 리턴 타입, 이름)
        System.out.println("====플레이어의 정보====");
        System.out.println("# 닉네임: " + ninkname);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }
}
