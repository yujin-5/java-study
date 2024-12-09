package chap2_5.fileio.textstream;

import chap2_5.fileio.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader(FileExample.ROOT_PATH + "/pet.json ")) {

            //텍스트를 라인 단위로 읽는 보조 스트림
            BufferedReader br = new BufferedReader(fr);

            while (true) {
                String data = br.readLine();
                if(data == null) break;
                System.out.println(data);
            }

        } catch (Exception e) {
            System.out.println("파일 로드에 실패했습니다.");
        }
    }
}
