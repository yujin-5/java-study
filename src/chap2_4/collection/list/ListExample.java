package chap2_4.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();
        hobbies.add("수영");
        hobbies.add("축구");
        hobbies.add("영화감상");
        hobbies.add("낮잠");

        System.out.println(hobbies);
    }
}
//리스트: 공통적인 특징은 순서가 있다는 것
//그래서 리스트는 인덱스가 있음
//또한 리스트는 데이터 중복 저장이 가능함
//배열은 데이터가 물리적으로 모여 있음
//연결 리스트는 다같이 모여 살지 않고 흩어져서 삼 -> 탐색은 느린데 추가와 삭제가 빠름
//리스트의 조상의 조상은 이터러블(반복 가능한)
//리스트 반복문 사용 가능함