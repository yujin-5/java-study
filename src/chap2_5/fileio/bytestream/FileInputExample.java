package chap2_5.fileio.bytestream;

import chap2_5.fileio.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {

        //try~with~resource: 메모리 누수가 있을 수 있는 코드를 자동 해제
        //-> finally를 대체할 수 있음

        try(FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/pet.txt");) {

//            int data = fis.read();
//            System.out.println("data = " + data); //ace의 첫번째 글자인 a만 읽음
//
//            data = fis.read();
//            System.out.println("data = " + data); //ace의 두번째 글자인 c만 읽음

            int data = 0;
            while((data=fis.read())!= -1){
                //아스키 코드를 문자로 출력
                System.out.write(data);
            }
            //출력 버퍼 비우기
            //데이터가 조금밖에 없어서 데이터를 밀어줘야 함
            System.out.flush();

        } catch (Exception e) {
            System.out.println("파일 로드에 실패했습니다.");
        }
//        finally {
//            //예외에 관계없이 실행할 코드
//            //메모리 누수를 위해 fis를 닫아주는 게 좋음 (매모리 해제)
//
//            try {
//               if(fis != null) fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
