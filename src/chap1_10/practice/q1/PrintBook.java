package chap1_10.practice.q1;

public class PrintBook extends Book {

    private int pageCount;

    public PrintBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("pageCount = " + pageCount);
    }

}
