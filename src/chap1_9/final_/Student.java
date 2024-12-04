package chap1_9.final_;

public class Student {

    public String name; //학생명
    public final String ssn; //주민번호
                            //final 필드: 한 번 정해지면 값을 못 바꿈
                            //private은 밖에서만 막히고 안에서는 바꿀 수 있음
                            //생성자에서 값을 초기화시켜줌
                            //상수의 조건: 불변성과 유일성을 만족해야 함
                            //따라서 final키워드만으로는 불변성은 만족하나 유일성은 만족하지 못함
                            //자바에서 상수를 만들려면 final(불변성 만족)과 static(유일성 만족)을 같이 붙여야 함

    public final String nation = "한국"; //국적
                                        //생성자에서 값을 초기화 안 시켜주니까 필드 설정 시 값도 할당해야 함

    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }



}
