package chap1_3;

//자동차 설계도
public class Vehicle {

    //속성(필드) 정의
    //일반 속성
    //:일반적으로 잘 안 바뀜
    String company; //제조사
    String model; //모델명

    //상태 속성
    //:수시로 변함
    int cuttentSpeed; //현재 속소
    boolean isOn; //시동 여부

    //컴포지션 속성
    //객체가 객체를 중첩한 형태
    /*
      {
        owner: {}
      }
    */
    Owner owner;

    //기능
    //1. 시동을 켜는 기능
    void powerOn(){
        if(isOn) {
            System.out.println("시동이 이미 걸려있습니다.");
            return;
        }
        isOn = true;
        System.out.println(model + "의 시동이 걸렸습니다.");
    }
    //2. 시동을 끄는 기능
    void powerOff(){
        if(!isOn) {
            System.out.println("시동이 걸려있지 않습니다.");
            return;
        }
        isOn = false;
        System.out.println("시동이 꺼졌습니다.");
    }
    //3. 주행 기능
    void accelerate(){
        System.out.printf("%s 자동차가 주행을 시작합니다.", model);
        cuttentSpeed += 20;
        System.out.printf("현재 속도: %dkm/h\n", cuttentSpeed);
    }

    //생성자
    Vehicle(String modelName){
        model = modelName;
        //속성(필드) = 객체 값을 세팅하기 위한 데이터
    }



}
