package chap1_2;

public class VarScope {
    public static void main(String[] args) {
        //자바는 변수가 선언된 중괄호(블록)에서 태어나고
        //블록이 끝나는 부분에서 죽음
        int x1 = 10;
        if (true) {
            int x2 = 20;
            //int x1 = 30;
        }
        int x2 = 50;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        for(int i=0; i<3;i++){

        }
        //System.out.println(i);
    }
    int x2 = 10;
}
