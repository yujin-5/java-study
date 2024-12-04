package chap1_9.enum_.practice1;


public class LibraryBook {
    private String title;
    private String author;
    private GENRE genre;

    public LibraryBook(String title, String author, GENRE genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void getBookInfo(){
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("genre = " + genre);
    }


}
