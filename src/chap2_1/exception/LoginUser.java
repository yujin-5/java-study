package chap2_1.exception;

//로그인 검증을 수행하는 클래스
public class LoginUser {
    private String account; //가입 시 등록한 계정명
    private String password; //가입 시 등록한 비밀번호

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    //로그인 검증 기능
    //                              로그인 시도 계정        로그인 시도 비번
    public void loginvalidate(String inputAccount, String inputPassword)
        throws LoginInvalidException
        //throws: 이 메서드는 위함다는 것을 알림
    {
        //계정 검증
        if(!inputAccount.equals(this.account)){
            /*
            프로그램에서 예외로 인식하지 않지만
            실제로 비즈니스 상황에서 예외로 인식시켜야 하는 상황이 있음
            강제로 에러를 발생시켜야 함
            ex. 마이너스 통장이 아닌데 잔액보다 많이 출금하는 상황*/

            //throw: 발생시키다 (파이썬: raise)
            //프로그램을 망가뜨리기 위함이 아니라 치명적인 예외가 발생했음을 시스템에 알려주기 위함
            throw new LoginInvalidException("아이디가 일치하지 않습니다.");
        }

        //패스워드 검증
        if(!inputPassword.equals(this.password)){
            throw new LoginInvalidException("비밀번호가 일치하지 않습니다.");
        }

        System.out.println("로그인에 성공했습니다.");
    }

}
