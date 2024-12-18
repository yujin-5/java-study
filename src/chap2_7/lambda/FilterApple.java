package chap2_7.lambda;

import java.util.ArrayList;
import java.util.List;

//사과를 여러 가지 방법으로 필터링
public class FilterApple {
    /**
     * @solution - try1: 사과바구니에서 색상이 녹생인 사과들만 필터링하고 싶음
     * @param basket: 다양한 색상과 무게의 사과들이 들어있는 리스트
     * @return - 바스켓 안에 있는 녹색 사과들만 필터링해서 새 리스트에 담아서 반환
     * @problem - 만약에 다른 색깔의 사과를 필터링해야 한다면 이 메서드로는 불가능
     */

    public static List<Apple> filterGreenApples(List<Apple> basket){
        //메서드를 콜하면 사과 바구니를 줘야 함
        //필터링 작업 후에 녹색 사과들만 담아서 리턴해줘야 함

        //1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> greenBasket = new ArrayList<>();
        //2.반복문과 조건문을 통해 녹색 사과를 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == Color.GREEN){ //색깔이 녹색인 사과들을
                greenBasket.add(apple); //바구니에 담아
            }
        }
        return greenBasket; //녹색사과바구니를 리턴함

    }

    /**
     * @solution - try2: 색상을 파라미터화하여 원하는 컬러의 사과를 필터링
     * @param basket: 다양한 색상과 무게의 사과들이 들어있는 리스트
     * @param color: 원하는 색상
     * @return - 바스켓 안에 있는 녹색 사과들만 필터링해서 새 리스트에 담아서 반환
     * @problem - 만약 필터링 기준이 색상이 아니라면 => 필터링 기준이 너무 많음
     */

    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color){
        //메서드를 콜하면 사과 바구니를 줘야 함
        //필터링 작업 후에 녹색 사과들만 담아서 리턴해줘야 함

        //1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> greenBasket = new ArrayList<>();
        //2.반복문과 조건문을 통해 특정 색상의 사과를 필터링
        for (Apple apple : basket) {
            if(apple.getColor() == color){ //색깔이 녹색인 사과들을
                greenBasket.add(apple); //바구니에 담아
            }
        }
        return greenBasket; //녹색사과바구니를 리턴함
    }

    //기능(함수)를 파라미터화할 수 있는가?
    //원칙적으로 불가
    //함수를 전달할 수 없는 대신 객체를 전달하여 그 객체 안에 함수를 호출하는 식으로 처리

    /**
     * @solution - try3: 동작(기능, 메서드)를 추상화시켜 파라미터화한다.
     * @problem - 필터링 대상이 사과가 아니라면 -> 사과를 제네릭 타입으로 바꿔주면 해결됨
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate a){
        //메서드를 콜하면 사과 바구니를 줘야 함
        //필터링 작업 후에 녹색 사과들만 담아서 리턴해줘야 함

        //1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> filteredBasket = new ArrayList<>();
        //2.반복문과 조건문을 통해 특정 색상의 사과를 필터링
        for (Apple apple : basket) {
            if(a.test(apple)){ //<-이 함수의 내용이 바뀔 예정, 기능을 오버라이딩을 통해 바꿀 수 있음
                //특정 조건이 뭔지 정의되어 있지 않고 있으며, true false를 반환한다는 사실은 변하지 않음
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    /**
     * @solution - try4: 여러 객체들을 필터링할 수 있도록 제네릭을 사용
     */
    public static <T> List<T> filter(List<T> list, GenericPredicate<T> p){
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if(p.test(t)){
                filteredList.add(t);
            }
        }
        return filteredList;
    }

}

