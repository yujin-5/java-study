package chap1_3.arrayList;

public class ListMain {
    public static void main(String[] args) {

        //문자열 데이터를 배열로 모아서 보관하고 싶음
        StringList student = new StringList();
        student.push("김또또");
        student.push("박뽀삐");

        student.printArray();

        StringList hobbies = new StringList();
        hobbies.push("수영");
        hobbies.push("축구");
        hobbies.push("낮잠");

        hobbies.printArray();

        System.out.println("students의 주소값:" + student);
        System.out.println("students sArr의 주소값: " + student.sArr);

    }
}
