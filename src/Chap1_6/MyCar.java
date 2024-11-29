package Chap1_6;

public class MyCar {

    //필드
    private String mode; //변속 모드 : D , R, P , N

    //변속 모드를 검증하고 세팅해주는 메서드: setter
    public void setMode(String mode){
        switch (mode){
            case "D": case "R": case "N" : case "P":
                this.mode = mode;
                break;
            default:
                this.mode = "P";
        }
    }

    //필드 값을 가져오는 메서드: getter
    public String getMode() {
        return mode;
    }

    //메서드
    //엔진오일을 분사하는 기능
    private void injectOil(){
        System.out.println("엔진오일이 분사됩니다.");
    }

    //실린더가 움직이는 기능
    private void moveCylinder(){
        System.out.println("실린더가 움직입니다.");
    }

    //시동을 거는 기능
    private void powerOn(){
        System.out.println("시동이 걸렸습니다.");
    }

    //시동 버튼을 누르는 기능
    public void pressStartButton(){
        System.out.println("시동 버튼을 눌렀습니다. ");
        injectOil();
        moveCylinder();
        powerOn();
    }

}
