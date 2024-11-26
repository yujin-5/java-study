package chap1_5.player;

public class Player {
    
    String nickName;
    int level;
    int hp;
    
//    Player(String nickName){
//        this.nickName= nickName;
//        //받아온 닉네임을 나의(this) 닉네임으로 설정한다
//        //this는 오로지 필드에만 붙일 수 있음
//        //this를 붙임으로써 지연변수와 구분함
//        this.level = 1;
//        this.hp = 50;
//        //this를 안 붙이면 컴파일 단계에서 자동으로 붙임
//    }
//Alt+insert누르면 생성자 바로 만들 수 있음

    public Player(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    //공격 기능
    //this는 매개변수에 자동으로 들어가 있음
    void attack(Player this,Player targetPlayer){

        System.out.println("this = " + this);
        System.out.println("targetPlayer = " + targetPlayer);
        //상대방의 체력이 10감소하고
        targetPlayer.hp -=10;
        //내 체력이 5감소
        this.hp -=5;

        System.out.printf("%s님이 %s님을 공격했습니다.\n",
                this.nickName, targetPlayer.nickName);
        System.out.println("나의 현재 체력: " +this.hp);
        System.out.println("상대방의 현재 체력: " +targetPlayer.hp);
    }
}
