package chap1_10.practice.q1;

public abstract class Book {

    //필드
    protected String title;
    protected String author;

    //생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //추상 메서드
    public abstract void displayInfo();

}
