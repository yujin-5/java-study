package chap2_1.exception;

//사용자 정의 예외
//클래스명에 -Exception를 접미사로 붙여주는 게 관례
//1. Exception 상속
//2. 생성자 2개 생성
public class LoginInvalidException extends Exception {

    //기본생성자: 에러메시지가 딱히 없는 경우
    public LoginInvalidException() {
    }

    //에러메시지를 등록하는 생성자
    public LoginInvalidException(String message){
        super(message);
    }
}
