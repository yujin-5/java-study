package chap1_7.inherit.player;

public class Mage {
    String ninkname;
    int level;
    int hp;
    int mana; //마력 게이지

    //생성자
    public Mage(String ninkname) {
        this.ninkname = ninkname;
        this.level = 1;
        this.hp = 50;
        this.mana = 60;
    }

    //상태정보를 확인하는 메서드
    public void showStatus(){
        System.out.println("====Player's Info====");
        System.out.println("# 닉네임: " + ninkname);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }

    //마법사 스킬
    public void fireBall(){

    }

}
