package chap1_7.inherit.player;

public class Hunter extends Player {

    int concentrate; //집중 게이지

    //생성자
    public Hunter(String ninkname) {
        super(ninkname);
        this.concentrate = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# 집중: " + concentrate);
    }

    //사냥꾼 스킬
    public void summonBeast(){

    }

}
