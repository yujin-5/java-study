package chap1_2.array;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        //2차원 배열 (배열 안의 배열)
        /*
        [
            [1,2,3],
            [4,5,6],
            [7,8,9]
         ]
         length: 3
        */

        // 국영수 점수를 저장할 때
        // 배열을 사용하면 변수의 양도 줄이고 반복문 처리도 수월해짐
        int kor = 77;
        int eng = 100;
        int math = 99;

        // 우리반 학생들의 국영수 점수를 저장
        int[] scoresKim = {kor, eng, math};
        int[] scoresPark = {100, 22, 56};
        int[] scoresHong = {40, 90, 80};

        // 2차원 배열
        int[][] classScores = {scoresKim, scoresPark, scoresHong};

        /*
            [
                [77,100,99],
                [100,22,56],
                [40,90,80]
            ]
         */

        System.out.println(scoresKim); //주소
        System.out.println(classScores[0]); //주소
        System.out.println(Arrays.toString(classScores[0])); //[77,100,99]

        System.out.println(Arrays.toString(classScores)); //1차원 배열 주소 3개가 들어 있음
        System.out.println(Arrays.deepToString(classScores));

        System.out.println("=========================");

        int[][] arr2d = {
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };

        for(int[] arr: arr2d) { //1차원 배열을 꺼내는 작업
            for(int n : arr){ //1차원 배열에서 데이터를 꺼내는 작업
                System.out.print(n + " ");
            }
            System.out.println(); //줄 바꿈
        }

        System.out.println("==========================");

        //배열의 값 없이 생성만 하고 싶으면
        int[][] arr32 = new int[3][2]; //3행 2열
        System.out.println(arr32.length); //3
        System.out.println(Arrays.deepToString(arr32));

    }
}
