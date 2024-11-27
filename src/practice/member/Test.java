package practice.member;

public class Test {
    public static void main(String[] args) {

        //멤버 저장소 객체 생성
        MemberRepository mr = new MemberRepository();

        //회원 데이터 추가
        mr.addMember(new Member("ppp@lll.com","9999","말포이",Gender.MALE,10));
        mr.addMember(new Member("yyy@bbb.com","1222","꼬꼬닭",Gender.MALE,20));

        //이메일 중복 검사
        boolean flag = mr.isDuplicateEmail("fff@ggg.com");
        System.out.println("flag = " + flag);

        //전체 회원 데이터 조회
        Member[] members = mr.getMembers();
        for (Member m : members) {
            m.inform(); //member 클래스에 inform함수를 만들어야 함
                        //memberRepository는 전체 회원을 관리할 뿐 개별 회원에 대한 정보는 모름
                        //함수 만들 때 유의할 것!
        }
    }
}
