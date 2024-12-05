package chap1_7.inherit.player;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("주차왕파킹");
        Mage mage = new Mage("충격왕쇼킹");
        Hunter hunter = new Hunter("스티븐호킹");

        //warrior.rage = 10;
        //warrior.ninkname = ""; //워리어는 플레이어를 확장했기 때문에 플레이어가 갖고있는 닉네임을 워리어에서도 사용 가능함

        warrior.dash();
        warrior.showStatus();
        mage.showStatus();
        hunter.showStatus();

    }
}
