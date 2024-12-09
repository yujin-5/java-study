package chap2_5.fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

    //터미널에서 파일 만들 땐 touch, 폴더 만들 땐 mkdir

    // 파일을 저장할 기본 경로를 상수로 설정
    public static final String ROOT_PATH = "C:/fileUpload"; //재활용하려고 프라이빗에서 퍼블릭으로 바꿈

    public static void main(String[] args) {
        //폴더 생성 명령
        //폴더명을 파일 객체로 래핑
        File rootDirectory = new File(ROOT_PATH);
        if(!rootDirectory.exists()){ //해당 경로가 존재하지 않는다면
            rootDirectory.mkdir(); //폴더 생성해라
        }

        //파일 생성 명령
        //파일명을 파일 객체로 매핑
        File newFile = new File(ROOT_PATH + "/food.txt");
        if(!newFile.exists()){
            try {
                newFile.createNewFile(); //throws -> try~catch 로 예외처리 필요
            } catch (IOException e) {
                System.out.println("파일 생성에 실패했습니다.");
            }
        }

        //데이터 입력 명령



    }

}
