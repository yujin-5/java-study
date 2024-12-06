package chap2_3.generic.list;

import java.util.Arrays;

//제네릭 배열을 관리하는 제네릭 리스트 클래스
public class GenericList<T> {

    //속성
    private T[] arr;

    //생성자
    public GenericList(){
        //arr = new T[0];
        arr = (T[]) new Object[0]; // T배열 타입으로 다운 캐스팅
    }
    public GenericList(T...initItems){
        arr = initItems;
    }

    //기능
    //copy 기능: 원본 복제
    public T[] copy(int capacity){
        T[] newSizeArray = (T[])new Object[arr.length + capacity];
        int loopCount = (capacity >= 0) ? arr.length : newSizeArray.length;
        for (int i = 0; i <loopCount ; i++) {
            newSizeArray[i] = arr[i];
        }
        return newSizeArray;
    }

    //push 기능
    public void push(T newItem){
        T[] temp = copy(1);
        temp[temp.length-1] = newItem;
        arr = temp;
    }

    //pop 기능
    public T pop() { //지워지는 T를 리턴
        if (arr.length == 0) {
            System.out.println("더 이상 제거할 수 없습니다.");
            return null;
        }
        T deletedElem = arr[arr.length - 1];
        arr = copy(-1);
        return deletedElem;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}
