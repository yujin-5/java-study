package chap2_1.exception;

public class Main {
    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc123","1234");

        try {
            user.loginvalidate("abc1234","1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
