package chap1_8.poly.casting;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 50;
        child.p1 = 200;

        child.parentMethod();
        child.childMethod();

        System.out.println("==============");
        Parent parent = new Parent();
        parent.p1 = 50;
        //parent.c1 = 200; //불가능
        //상속은 일방적으로 부모가 자식에게 하는 것
        //자식은 부모 걸 사용할 수 있지만
        //부모는 자식 걸 사용할 수 없음
        parent.parentMethod();

        System.out.println("===============");
        Parent castingChild = new Child(); //겉모습을 parent지만 실질적으로 child임 => 업캐스팅 => 타입이 상승함
        System.out.println("castingChild = " + castingChild);

        castingChild.parentMethod();
        //castingChild.childMethod(); //child 메서드 접근 안 됨
        ((Child)castingChild).childMethod(); //다운 캐스팅하면 child 메서드 접근할 수 있음
                                            // 다운 캐스팅은 수동으로 해줘야 함

/* 타입을 업케스팅하는 것은 자식타입의 객체를 부모타입으로 사용하는 것을 말하며 이것은 자동으로 처리된다.
* 그러나 업캐스팅이 되면 자식의 원래 속성과 기능을 사용할 수 없는 문제가 생김 */

    }
}
