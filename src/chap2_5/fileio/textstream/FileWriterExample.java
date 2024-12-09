package chap2_5.fileio.textstream;

/*
바이트 기반 스트림은 텍스트, 이미지, 영상 등을 1바이트 단위로 입출력
-> inputStream, outputSteam
텍스트 기반 스트림: 오직 텍스트만을 2바이트 단위로 입출력
-> Reader, Writer
 */

import chap1_9.util.InputUtil;
import chap2_5.fileio.FileExample;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter(FileExample.ROOT_PATH + "/hobby.txt")){

            String hoddy = InputUtil.inputStr("취미를 입력하세요: ");

            //파일 생성 명령
            fw.write("당신의 취미: " + hoddy);
            System.out.println("파일 저장에 성공했습니다.");

        } catch (Exception e){
            System.out.println("파일 저장에 실패했습니다.");
        }
    }
}
