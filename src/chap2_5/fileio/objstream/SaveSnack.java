package chap2_5.fileio.objstream;

import chap2_5.fileio.FileExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {
        //과자들을 텍스트로 분할해서 저장하는 게 아니라
        //과자 객체를 통채로 세이브 파일에 저장하고 싶다.

        List<Object> snackList = List.of(
                new Snack("콘칲", 1970, 1500, Snack.Taste.Good),
                new Snack("오징어집", 1985, 1800, Snack.Taste.Good),
                new Snack("사브레", 1980, 3000, Snack.Taste.Bad));

        try(FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/snack.sav")){
            //fos.write(snackList);
            //객체를 바이트로 변환시켜줘야 함
            //ObjectOutputStream 사용
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);
            System.out.println("객체 저장 성공!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
//NotSerializableException
//객체가 스트림을 통과하려면 직렬화라는 개념이 필요함
//직렬화하기 전에 직렬할 수 있는지 먼저 물어봐야 함
