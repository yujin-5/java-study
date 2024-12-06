package chap2_4.collection.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>(); //map의 value타입은 object로 명시하는 게 일반적
        //json으로 변환할 때 사용!
        //데이터 추가: put
        map.put("empName","김철수");
        map.put("hireDate", LocalDate.of(2012,3,15));
        map.put("salary",5000000);

        System.out.println(map);
        System.out.println(map.size()); 
        
        //맵에 있는 데이터 꺼내기: get
        String empName = (String) map.get("empName");
        System.out.println("empName = " + empName);

        int salary = (int) map.get("salary");
        System.out.println("salary = " + salary);

        //중복된 키를 사용해서 생성하면 수정으로 처리
        map.put("empName","박영희");
        System.out.println(map);

        //맵의 순회 
        Set<String> keys = map.keySet(); //맵에서 키만 추출
                                        //set타입은 반복문 사용 가능
                                        //키로 밸류값 접근해서 전체 순회할 수 있음

        for (String key : keys) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }
        
    }


}
