package chap1_9.practice.q2;

public class Employee {

    private long employeeId; //사원번호 -> 보통 실무에서 식별번호는 long으로 지정함 ex.배민 주문번호, 로그 이력
    private String name; //사원명
    private static int idCount; //일련번호 누적을 관리

    //생성자
    //사번은 직원이 입력하는게 아니라 자동으로 생성되어야 함
    public Employee(String name) {
        this.employeeId = ++idCount;
        this.name = name;
    }

    //메서드
    void getEmployeeInfo(){
        System.out.println("employeeId = " + employeeId);
        System.out.println("name = " + name);
    }


}
