package chap1_9.depart;

//학과 설계도
public class Department {

    private String departmentName; //학과명
    private int studentCount; //학과 학생 수
    static private int totalStudentCount; //모든 학과 학생 수 총합 -> 모든 학과가 이 데이터를 돌려쓰면 되므로 static 붙일 수 있음

    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudentCount += this.studentCount; //학과가 하나 만들어질 때 마다 학생 수 총합이 늘어남
    }

    //학생 수를 추가하는 메서드
    //통계학과에 3명 추가, 물리학과에 10명 추가
    //this 필요
    public void addStudent(int number){
        this.studentCount += number;
        totalStudentCount += number;
    }

    //학과 학생 수를 조회하는 메서드
    //물리학과 학생 수 가져와
    //수학과 학생 수 가져와
    public int getStudentCount(){
        return studentCount;
    }

    //모든 학과 학생 수를 조회하는 메서드
    //특정 학과 지목할 필요 없으므로 static붙이면 됨
    public static int getTotalStudentCount(){
        return totalStudentCount;
    }

}
