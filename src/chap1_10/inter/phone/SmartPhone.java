package chap1_10.inter.phone;

public interface  SmartPhone {


    //카메라 기능
      void camera();
    //충전 기능
      void charge();
    //인터넷 기능
      void internet();
    //=>추상 메서드를 만들면 위 기능을 안 만들고 넘어가는 실수를 예방할 수 있게 함
    //인터페이스 =규격

}
//일반 메서드 만들 수 없음
//단, static메서드는 만들 수 있음
//필드도 가질 수 없음
//단, 상수는 가질 수 있음
//엄격한 추상화
//실무에서는 추상화보다 인터페이스를 많이 씀
