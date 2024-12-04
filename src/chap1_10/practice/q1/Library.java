package chap1_10.practice.q1;

public class Library {
    public static void main(String[] args) {
        EBook ebook1 =new EBook("혼공자","신용권",99.9);
        ebook1.displayInfo();

        PrintBook printBook1 = new PrintBook("채식주의자","한강",265);
        printBook1.displayInfo();


    }

}
