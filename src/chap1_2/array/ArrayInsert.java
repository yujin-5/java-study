package chap1_2.array;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        //2번 인덱스에 70을 집어넣고 싶다면
        //[10,50,70,90,100,150]
        int[] numbers = {10,50,90,100,150};

        int targetIndex = 2;
        int newNumber = 70;

        //1. 사이즈가 1큰 배열을 생성 후 기존 데이터 모두 복사
        int[] newArray = new int[numbers.length+1];
        for (int i = 0; i <numbers.length ; i++) {
            newArray[i] = numbers[i];
        }

        //2. 마지막 데이터부터 시작해서 한 칸씩 뒤로 복사
        //[10,50,90,100,150,150]

        //정규화
        for (int i = numbers.length; i > targetIndex ; i--) {
            newArray[i] = newArray[i-1];
        }

//        newArray[3] = newArray[2];
//        newArray[5] = newArray[4];
//        newArray[4] = newArray[3];

        //3. 2번 인덱스에 값을 새로운 값으로 수정
        newArray[targetIndex] = newNumber;

        numbers = newArray;
        newArray = null;

        System.out.println(Arrays.toString(numbers));

    }
}
