package chap2_2.lang;

import java.util.Objects;

class Pen extends Object{
    long serial; //일련번호
    String color;
    int price;

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    //Onject클래스의 toString을 오버라이딩
    //객체 주소값은 사실 궁금하지 않음
    //필드값이 궁금함
    //보통 필드값을 출력하도록 바꿈

    @Override
    public String toString() {
        return "Pen{" +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

//    @Override
//    public String toString(){
//        return String.format("시리얼: %s, 색상: %s, 가격: %d원",serial,color,price) ;
//    }

    //equals를 통해 모든 필드값이 같으면 두 객체를 같은 객체로 인식시키기
    //실무에선 유니크한 데이터만 같으면 두 객체를 같은 객체로 인식함
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return serial == pen.serial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color, price);
    }


//    public boolean equals(Object o){
//        if(this == o) return true;
//        if(this == null ) return false;
//
//        Pen target = (Pen)o;
//        //모든 필드값 비교
//        if(this.serial == target.serial
//        && this.price == target.price
//        && this.color == target.color){
//            return true;
//        } else{
//            return false;
//        }
//
//    }
}

public class ObjectSample {
    public static void main(String[] args) {
        Pen yellowPen = new Pen(100L,"노랑", 1000);
        Pen bluePen = new Pen(200L,"파랑", 1200);
        Pen bluePen2 = new Pen(200L,"파랑", 1200);
        System.out.println("yellowPen.toString() = " + yellowPen.toString());
        System.out.println("bluePen = " + bluePen);

        System.out.println("두 펜이 같은가? " + (bluePen.equals(bluePen2) )); //사람의 시선과 컴퓨터의 시선이 다름
        //모든 값이 똑같은데 시스템은 다르다고 인식함
        //그래서 object에서 equals를 제공함
        //기본 equals는 주소값 비교
    }
}
