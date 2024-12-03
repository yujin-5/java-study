package chap1_6.practice;

public class LibraryMember {

    //필드
    public String memberId;
    private String name;
    private int borrowedBooks;

    //생성자
    //1. 기본 생성자
    //2. 매개변수가 있는 생성자
    public LibraryMember(String memberId, String name){
        this.memberId =memberId;
        this.name = name;
        this.borrowedBooks = 0;
    }

    //메서드
    void borrowBook(){
        if(borrowedBooks > 5){
            System.out.println("대여 가능 권수를 초과했습니다.");
            return;
        } else {
            borrowedBooks++;
            System.out.println("대여 성공!");
        }
    }

    void returnBook(){
        borrowedBooks--;
        System.out.println("반납 성공!");
    }


}
