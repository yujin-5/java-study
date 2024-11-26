package chap1_4;

import chap1_4.juice.Banana; //어떤 바나나를 가져올 건지 미리 정해놓을 수 있음
import chap1_4.juice.*;
//이 패키지 안에 있는 건 패키지명없이 쓰겠다! 이름을 줄여 쓰기 위해 import를 쓰는 것임
//같은 패키지 않에 있으면 import 안 써도 됨

public class AppleMain {
    public static void main(String[] args) {
        Apple apple1 = new Apple();

        chap1_4.cake.Apple apple2 = new chap1_4.cake.Apple();

        Banana banana =new Banana();

        /*
        패키지 이름 관례
        1. 전부 소문자로 작성
        2. 변수나 메서드 이름처럼 관례를 지킬 것
        -특수문자 x, 띄어쓰기 x, 한글 x
        3. 띄어쓰기가 있는 경우
        -> 패키지를 쪼갬
        ex. my phone number -> my.phone.number
       4. 웬만하면 자바라는 단어를 쓰지 말 것
       -> 라이브러리랑 헷갈림
        */
    }
}
