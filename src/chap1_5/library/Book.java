package chap1_5.library;

public class Book {
    String title; //책 제목
    String author; //저자명
    int year; //출판연도
    //만약 클래스 안에 생성자를 "하나도 안 만들면"
    //자동으로 파라미터가 없는 기본 생성자를 만듦

    int n1,n2,n3;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
    //주소값 안 궁금하고 필드 값이 궁금할 때 사용하는 메서드
    //main에서 sout하면 필드 값이 나옴

    public Book(String title) {
//        this.title = title;
//        this.author = "고길동";
//        this.year = 2024;
        this(title, "고길동",2024);
        //this() -> 나의 다른 생성자를 불러주세요
        //밑에 있는 생성자한테 업무를 위임할 수 있음
        //this() 맨 첫 줄에 있어야 함
        System.out.println("1번 생성자 호출!");
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("2번 생성자 호출!");
    }

    void add1(int n1, int n2){
//        this.n1 = n1;
//        this.n2 = n2;
//        this.n3 = 100;
        add2(n1,n2,100); //메서드 위임
    }
    void add2(int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

}

