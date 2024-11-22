package chap1_2.function;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};

    static String[] printFoods() {
        System.out.println(Arrays.toString(foods));
        return foods;
    }

    public static void push(String food) {
        String[] newArray = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            newArray[i] = foods[i];
        }
        newArray[newArray.length - 1] = food;
        foods = newArray;
        newArray = null;
    }

    static int indexOf(String food){
        int index = -1;
        for (int i = 0; i < foods.length ; i++) {
            if(food.equals(foods[i])){
                return index = i;
            }
        }
        return index;
    }

    static String[] pop(){
        String[] newArray = new String[foods.length-1];
        for (int i = 0; i < foods.length-1 ; i++) {
            newArray[i] = foods[i];
        }
        foods = newArray;
        newArray = null;
        return foods;
    }

    public static void remove(String food){
        int targetIndex = indexOf(food); //치킨 인덱스: 1
        foods[1]=foods[2];
        foods[2]=foods[3];

        String[] newArray = new String[foods.length-1];
        for (int i = 0; i < foods.length-1 ; i++) {
            newArray[i] = foods[i];
        }
        foods = newArray;
        newArray = null;
    }

    static Boolean include(String food){
        int index = -1;
        for (int i = 0; i <foods.length ; i++) {
            if (food.equals(foods[i])){
                index = i;
            }
        }
        if(index >= 0){
            return true;
        } else{
            return false;
        }
    }

    static String[] insert(int startIndex, String food){

    }


    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
        printFoods();

        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

//        insert(3, "파인애플");
//        printFoods();
//
//        modify(2, "닭갈비");
//        printFoods();

    }
}
