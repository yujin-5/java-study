package chap1_5.player;

public class Main {
    public static void main(String[] args) {
        Player shocking =new Player("충격왕쇼킹");
        Player insulting= new Player("욕설왕퍼킹");

        System.out.println("shocking = " + shocking);
        System.out.println("insulting = " + insulting);
        
        shocking.attack(insulting); //쇼킹이 인설팅을 때림
        //-> shocking이 this가 됨
        insulting.attack(shocking); //인설팅이 쇼킹을 때림
        //->insulting이 this가 됨
    }
}
