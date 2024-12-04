package chap1_9.enum_;

public class Pizza {

    private String pizzaName;
    private PizzaStatus status;

    public String getStatus() {
        return this.status.getDescription();
    }

    //피자 주문 기능
    public void orderPizza(){
        this.status = PizzaStatus.ORDERED;
        System.out.println("피자 주문이 들어왔습니다.");
    }
    //피자 요리 완료 기능
    public void readyPizza(){
        if(this.status.equals("ORDERED")){
            this.status = PizzaStatus.READY;
            System.out.println("피자 요리가 완료되었습니다.");
        } else{
            System.out.println("아직 피자 주문이 없습니다.");
        }
    }
    //피자 배달 기능
    public void deliverPizza(){
        if(this.status.equals("READY")){
            this.status = PizzaStatus.DELIIVERED;
            System.out.println("피자가 배달되었습니다.");
        } else{
            System.out.println("피자가 아직 요리 중입니다.");
        }

    }

    //문자열로 데이터 관리하면 오타에 대비하기 어려워짐
    //상수로 데이터 관리하면 디버깅하기 편해짐 (실수했을 때 오류를 알려주므로)
    //열거형으로 데이터 관리하면 더 편해짐

}
