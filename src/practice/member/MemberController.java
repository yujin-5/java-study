package practice.member;

import java.util.Scanner;

//역할: 회원관리 앱의 입출력을 담당
public class MemberController {

    //의존성 필드: 객체가 일을 하기 위해 다른 객체에 의존(=협력)
    Scanner sc;
    MemberRepository mr;

    MemberController(){
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }

    //프로그램 초기 화면 출력
    void mainView(){
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 전체 회원 조회하기");
        System.out.println("* 3. 개별 회원 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료하기");
        System.out.println("===========================");
    }

    //3번 메뉴 개별 조회 입출력
    void showDetails(){
        String email = prompt("#조회 대상의 이메일: ");

        //조회 대상을 탐색하고 탐색 성공시 해당 객체를 받아옴
        Member foundMember = mr.findMemberByEmail(email);
        if(foundMember != null) { //이메일 찾음
            foundMember.detailInfo();
        } else { //이메일 못 찾음
            System.out.println("\n#조회 결과가 없습니다.");
        }


    }


    //프로그램을 실행하는 메서드
    void start(){
        while(true){
            mainView();
            String menuNum = prompt(">>");

            switch (menuNum){
                case "1":
                    signUp();
                    break;
                case "2":
                    showAllmembers();
                    break;
                case "3":
                    showDetails();
                    break;
                case "7":
                    System.out.println("프로그램 종료하기!");
                    return;
            }
        }
    }

    //이메을을 중복이 안 될 때까지 입력받고 중복이 안 된 이메일을 리턴
    String checkDuplicateEmailInput() {
        while (true) {
            String email = prompt("# 이메일: ");
            if (mr.isDuplicateEmail(email)) {
                System.out.println("# 이메일이 중복되었습니다.");
            } else { // 중복이 안된 경우
                return email;
            }
        }
    }

    //        String email;
//        while (true) {
//            email = prompt("# 이메일: ");
//            //중복 검사
//            if (mr.isDuplicateEmail(email)){
//                System.out.println("# 이메일이 중복되었습니다.");
//                continue;
//            }else {
//                break;
//            }
//        }

    //회원가입 입출력을 처리하는 메서드
    void signUp(){
        System.out.println("\n ====== 회원 가입을 시작합니다. =====");
        String email = checkDuplicateEmailInput();
        String password = prompt("# 패스워드: ");
        String name = prompt("# 이름: ");

        String genderString = prompt("# 성별(M/F): ");
        Gender gender = genderString.equals("M") ? Gender.MALE : Gender.FEMALE;
//        String genderString;
//        while (true){
//            genderString = prompt("# 성별(M/F): ");
//            //중복 검사
//            if(genderString == "M" || genderString == "F"){
//                break;
//            }else{
//                System.out.println("# 잘못된 입력입니다.");
//                continue;
//            }
//
//        }


        String age = prompt("# 나이: ");

        //회원 목록에 추가
        mr.addMember(new Member(email, password, name, gender, Integer.parseInt(age)));
        System.out.println("# 회원가입이 완료되었습니다.");
    }

    //전체 회원 정보를 화면에 출력하는 메서드
    void showAllmembers(){
        //전체 회원정보 가져옴
        Member[] members = mr.getMembers();
        System.out.println("\n======전체 회원 정보======");
        for (Member m : members) {
            m.inform();
        }
        System.out.println("\n======엔터를 눌러서 계속...======");
        //입력커서를 생성해서 코드를 잠시 중단시킴
        sc.nextLine();
    }

    //입력을 쉽게 처리해주는 메서드
    String prompt(String message){
        System.out.print(message);
        String input = sc.nextLine();
        return input;
    }

}
