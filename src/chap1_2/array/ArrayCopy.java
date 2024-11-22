package chap1_2.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets = {"멍멍이", "야옹이", "짹짹이"};
//        String[] petsCopy = pets; //원본 값을 복사한 게 아니라 원본 주소를 복사한 것임


//        String[] petsCopy = new String[pets.length];
//        for (int i = 0; i <petsCopy.length ; i++) {
//            petsCopy[i] = pets[i];
//        }

        String[] petsCopy = Arrays.copyOf(pets, pets.length);

//        petsCopy[0] = pets[0];
//        petsCopy[1] = pets[1];
//        petsCopy[2] = pets[2];

        pets[1] = "콩콩이"; //원본 값 수정했는데 사본 값도 같이 수정됨

        System.out.println("원본: " + Arrays.toString(pets));
        System.out.println("사본: " + Arrays.toString(petsCopy));
        System.out.println("원본의 주소: " + pets);
        System.out.println("사본의 주소: " + petsCopy);
    }
}
