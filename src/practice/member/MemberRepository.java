package practice.member;

//회원 객체를 여러개 모아서 관리할 설계도
public class MemberRepository {

    Member[] memberList; //가입된 회원 배열

    //생성자
    //[{},{},{}]
    //new Member[](new Member(),new Member(),new Member())
    MemberRepository() {
        this.memberList = new Member[]{
                new Member("abc123@def.com", "1234", "콩벌레", Gender.MALE, 15),
                new Member("fff@ggg.com", "5678", "팥죽이", Gender.FEMALE, 25),
                new Member("xxx@ccc.com", "9876", "카레빵", Gender.FEMALE, 35),
        };
    }

    //모든 회원 정보를 가져오는 메서드
    //void -> Member[]타입으로 변경
    Member[] getMembers() {
        return this.memberList;
    }

    //회원 목록에 새로운 회원을 추가하는 메서드
    void addMember(Member newMember) {
        //push
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;
        memberList = temp;

        //숫자 배열: [10,20,30,40]
        //객체 배열: [주소1, 주소2, 주소3]

    }

    //회원 목록에 기존 회원을 삭제하는 메서드
    void deleteMember(Member targetMember) {
        int index = -1;
        for (int i = 0; i < memberList.length; i++) {
            if (targetMember.equals(memberList[i])) { //멤버 목록에 있는 멤버면
                for (int idx = i; idx < memberList.length - 1; idx++) {
                    memberList[i] = memberList[i + 1];
                }
                Member[] temp = new Member[memberList.length - 1];
                for (int j = 0; j < temp.length - 1; j++) {
                    temp[j] = memberList[j];
                }
                memberList = temp;
                temp = null;
            } else {
                return;
            }
        }//end for
    }
//        memberList[2] = memberList[3];
//        memberList[3] = memberList[4];


    /**
     * 이메일 중복 여부를 확인하는 메서드
     *
     * @param targetEmail - 이메일 검사 대상 문자열
     * @return - 이메일이 중복이면 true, 중복이 아니면 false
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true; //이메일 중복임
            }
        } //end for
        return false; //이메일 중복이 아님
    }

    /**
     * 이메일을 통해 회원 목록 배열에서 해당 이메일을 가진
     * 객체를 찾아 리턴하는 메서드
     *
     * @param targetEmail - 탐색 대상의 이메일
     * @return - 이메일이 일치하는 회원을 반환, 일치하는 회원이 없다면 null을 반환
     * @author - dkfnfkds
     * @since - 24.11.27
     */
    Member findMemberByEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return m;
            }
        }
        return null; //명시적 없음
    }

}
