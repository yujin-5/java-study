package chap1_5.practice;

public class Employee {
    String name;
    String position;
    int salary;

    //생성자
    Employee(){
        name = "홍길동";
        position = "사장";
        salary = 10000000;
    }

    Employee(String name, String position, int salary){
        this.name= name;
        this.position = position;
        this.salary = salary;
    }

    Employee(String name, String position){
        this(name, position, 2000000);
    }

    //메서드
    void increaseSalary(double amount){
        salary += amount;
    }
    void displayEmployeeInfo(){
        System.out.println("name = " + name);
        System.out.println("position = " + position);
        System.out.println("salary = " + salary);
    }
}
