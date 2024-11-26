package chap1_5.practice;

public class EmployeeMain {
    public static void main(String[] args) {
         Employee kim = new Employee("김영희","차장");
         kim.displayEmployeeInfo();

         Employee lee=new Employee("이둘리","사원",1800000);
         lee.displayEmployeeInfo();

    }
}
