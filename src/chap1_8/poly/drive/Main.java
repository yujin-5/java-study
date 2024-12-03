package chap1_8.poly.drive;

public class Main {
    public static void main(String[] args) {
        Sonata sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

        // 쏘나타 3백만 대 엑셀을 밟아야 한다면 -> 반복문 사용 -> 배열 만듦
        // 쏘나타를 배열에 저장
        //Sonata[] sonataList = {sonata1, sonata2,sonata3};

        Tucson tucson1 = new Tucson();
        Car tucson2 = new Tucson();
        //투싼 20만 대 엑셀을 밝아야 한다면 -> 반복문 사용 -> 배열 만듦
        //Tucson[] tucsonList = {tucson1, tucson2};


        Tesla tesla1 = new Tesla();
        Car tesla2 = new Tesla();
        Car tesla3 = new Tesla();
        Car tesla4 = new Tesla();

        //Tesla[] teslaList = {tesla1, tesla2, tesla3, tesla4};
        Car[] carList = {sonata1, tucson1, tesla3, sonata2};
        for (Car car : carList) {
            car.accelerate(); //부모 타입에 액셀 기능을 만들면 오버라이딩.. 어쩌고 때문에 호출이 된다고 함
        }

        //세 종류의 데이터를 하나의 배열로 못 넣는 이유는 동종 모음 구조 특징 때문
        //모양을 같게 만들면 같이 담을 수 있음
        //Car를 공통 부모로 하면 Car타입으로 지역변수를 만들 수 있음


        System.out.println("====================");
        Driver kim = new Driver();
        kim.drive(sonata1);

        System.out.println("====================");
        CarShop shop = new CarShop();
        Car car = shop.exportCar(6000);
        car.accelerate();

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        //어쩔 수 없이 수동 캐스팅해야 하는 경우
        //소나타 클럽에 가입하고 싶은데 car타입으로 받아서 소나타 클럽 가입이 자동으로 안 됨
        //소나타 타입으로 수정하면 소나타 클럽에 가입할 수 있음
        Sonata baughtCar = (Sonata) shop.exportCar(3000);
        baughtCar.accelerate();
        baughtCar.joinSonataClub();
    }
}
