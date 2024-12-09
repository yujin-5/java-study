package chap2_5.fileio.bytestream;

import chap2_5.fileio.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

//바이트 기반 스트림: 이미지, 영상, 소스코드 파일 등의 모든 데이터를 전송할 수 있음
//그런데 전송 단위가 1바이트 단위라 바이트 스트림이라고 불림
//텍스트 전송에는 적합하지 않음 (-128~127까지밖에 표현 불가)

public class FileOutputExample {
    public static void main(String[] args) {

        //바이트 기반 출력 스트림: 파일을 내보낸다 (save 기능)
        try {
            FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/pet.txt"); //내보낼 세이브 파일의 경로 지정
            //fos.write(97); //a
            fos.write(new byte[]{97,99,101}); //ace
        } catch (Exception e) {
            System.out.println("해당 경로를 찾을 수 없습니다.");
        }


    }


}
