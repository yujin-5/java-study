package chap1_2;

public class DataType {

    //메인 메서도: 프로그램의 실행 기점
    public static void main(String[] args) {
        int age = 20; //타입 자동 완성: ctrl + alt + v
        double pi = 3.14;
        char c = '가';
        String greeting = "안뇽?";
        boolean flag = true;

        //정수 타입(byte, short, int, long)
        byte x1 = 127; //1바이트 -> 1byte==8bit -> -128~127까지 저장 가능
        short x2 = 32767; //2바이트 -> 2byte==16bit -> -32768~32767까지 저장 가능
        int x3 = 2147483647; //4바이트

        //10; //리터럴: 변수에 저장되기 전 데이터
        //정수 리터럴의 기본타입 int
        long x4 = 21474836478L; //8바이트

        System.out.println(x4);

        //------ 실수 타입-------
        float f1 = 3.145464455454545F; //4바이트
        double f2 = 3.145454544484888; //8바이트
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        //------ 논리 타입 -------
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;
        //자바는 truthy, falsy가 없음
        
        //------- 문자와 문자열 타입 -----
        char c1 = 'A'; //2바이트
        char c2 = 66; //B
        System.out.println("c2 = " + c2);

        //hello['h','e','l','l','o']
        char[] cArr ={'h','e','l','l','o'};
        String str = new String(cArr);
        System.out.println(new String(cArr));

        String str2 = "안녕하세요"; //쌍따옴표는 배열로 변환을 해주는 역할
        System.out.println("str2 = " + str2);

        //""": 줄 바꿈 -> 자바 17부터 지원
        String str3 = """
                        안녕
                        ㅇ아나우ㅏㅇ
                        ㅜ라ㅓㅏ하하"
                        """;

        //동적 타이핑 - 타입을 추론함
        //내 의도와 다르게 추론할 수 있으므로 사용 지양
        var z = 100; //int로 추론
        var h = "dnjdn"; //String으로 추론
    }
}
