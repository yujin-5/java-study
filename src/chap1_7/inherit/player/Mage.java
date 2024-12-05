package chap1_7.inherit.player;

public class Mage extends Player{
    //직업 개별 속성
    int mana; //마력 게이지

    //생성자
    public Mage(String ninkname) {
        super(ninkname);
        this.mana = 60;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 마력: " + mana);
    }

    //마법사 스킬
    public void fireBall(){

    }

}
