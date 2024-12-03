package chap1_9.practice.q2;

public class Employee {

    private static int employeeId;
    private String name;

    //생성자
    public Employee(String name) {
        this.name = name;
        employeeId++;
    }

    //메서드
    void getEmployeeInfo(){
        System.out.println("employeeId = " + employeeId);
        System.out.println("name = " + name);
    }


}
