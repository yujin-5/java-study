package chap1_3;

public class Book {

    //필드
    String title; //제목
    String author; //작가
    int yearPublished; //출간일

    //메서드
    void printDetails(){
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("yearPublished = " + yearPublished);
    }

    //생성자
    public Book(String bookTitle, String bookAuthor, int bookYearPublished){
        title = bookTitle;
        author = bookAuthor;
        yearPublished = bookYearPublished;
    }


}
