package chap1_3;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        String myName = "홍길동";

        System.out.println("inputName = " + inputName);
        System.out.println("myName = " + myName);

        //inputName == myName: 주소값 비교
        //이퀄스를 사용하면 글자 내부의 배열에서 한 글자씩 확인해봄
        //이퀄스: 랭쓰가 같은지, 0번 인덱스, 1번 인덱스, 2번 인덱스 값이 동일한지 비교
        if(inputName.equals(myName)){
            System.out.println("두 이름이 같습니다.");
        } else{
            System.out.println("두 이름이 다릅니다");
        }
    }
}
