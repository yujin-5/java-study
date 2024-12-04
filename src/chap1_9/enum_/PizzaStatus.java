package chap1_9.enum_;

public enum PizzaStatus {

    ORDERED("주문 완료", 10),
    READY("준비 완료", 30),
    DELIIVERED("배달 완료", 40);

    //상수의 추가 정보 데이터를 필드로 생성
    private String description;
    private int timeToSetup; //준비 소요 시간
    //해당 필드를 초기화할 생성자를 만듦
    PizzaStatus(String description, int timeToSetup) {
        this.description = description;
        this.timeToSetup = timeToSetup;
    }
    //접근제한된 필드의 값을 참조하는 getter
    public String getDescription() {
        return description;
    }

    public int getTimeToSetup() {
        return timeToSetup;
    }
    //    public static final String ORDERED = "ORDERED";
//    public static final String READY = "READY";
//    public static final String DELIVERED = "DELIVERED";

}
