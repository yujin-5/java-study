package chap1_3;

//실행용 클래스 -> main메서드 작성
//설계용 클래스와 실핼용 클래스 따로 있음
public class DancerMain {
    public static void main(String[] args) {

        //설계도(class)를 통해 객체(object)를 찍어낸다.
        //= 클래스를 통해 인스턴스를 생성한다.

        //new = "방 빌려줘"
        //댄서는 String, String[],int 데이터타입을 가지고 있음 => dancer타입 만듦
        //park에는 댄서 방 주소가 담겨 있음
        Dancer park = new Dancer();
        System.out.println("park = " + park);

        Dancer kim = new Dancer();
        System.out.println("kim = " + kim);

        //객체의 기능 사용 = 객체 참조 -> 참조연산자 "."을 사용
        park.dancerName = "박격포";
        park.crewName = "전쟁크루";
        park.danceLevel = 1;
        park.genres = new String[]{"힙합","스트릿","코레오"};
        park.dance();

        kim.dance(); //데이터 세팅을 안 해서 dancer함수 기본값이 들어가 있음

        Dancer gong = new Dancer("뽀로로");
        gong.dance();

        Dancer heartping = new Dancer("하츄핑","동방싱치");
        heartping.dance();
        heartping.introduce();

        Dancer merong = new Dancer("메롱롱","약오르지","케이팝","락킹","스트링");
        merong.introduce();
    }
}
