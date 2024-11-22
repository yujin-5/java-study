package chap1_2.array;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민",
                "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 우리 반 학생들의 별명: " + Arrays.toString(tvxq));
        System.out.println("- 삭제할 학생의 별명을 입력하세요");
        System.out.print("> ");
        String target = sc.nextLine();

        int index = -1;
        for (int i = 0; i < tvxq.length; i++) {
            if (target.equals(tvxq[i])) {
                index = i;
                break;
            }
        } //end for
        boolean isPresent = index != -1;
        if (isPresent == false) {
            System.out.printf("해당 별명 (%s)은(는) 존재하지 않습니다.", target);
        } else { //시아준수를 삭제한다고 하면
            //tvxq[2] = tvxq[3];
            //tvxq[3] = tvxq[4];

            //정규화
            for (int i = index; i <tvxq.length-1 ; i++) {
                tvxq[index] = tvxq[index+1];
            }

            String[] newArray = new String[tvxq.length - 1];
            for (int i = 0; i < tvxq.length - 1; i++) {
                newArray[i] = tvxq[i];
            }
            tvxq = newArray;
            newArray = null;
            System.out.println("* 삭제 후 정보: " + Arrays.toString(tvxq));

        }


    }
}

