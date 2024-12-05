package chap1_10.practice.q1;

public class Library {
    //Book 타입의 매개변수를 받아 해당 책 정보를 출력하는 메서드
    public void printBookInfo(Book book){
        book.displayInfo();
    }
}

//이북과 프린티트 북이 없어도 규격만 존재하다면 에러날 게 없음
//규격을 먼저 설계하고 구체적인 건 나중에 만들어도 됨
