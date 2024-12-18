package chap2_6.inner;

public class Main {
    
    //내부 클래스
    /*
    의도: 나는 뺄셈 계산기가 필요한데
    아무래도 여기서만 쓰고 다른 데서는 안 쓸 거 같아.
    클래스를 하나 새로 만드는 게 너무 귀찮아.
     */
    private static class SubCalculator implements Calculator{
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }
    
    public static void main(String[] args) {

        AddCalculator addCal = new AddCalculator();
        int reult1 = addCal.operate(50, 30);
        System.out.println("reult1 = " + reult1);

        SubCalculator subCal = new SubCalculator();
        int result2 = subCal.operate(100, 25);
        System.out.println("result2 = " + result2);

        SubCalculator subCal02 = new SubCalculator();
        int result02 = subCal.operate(1, 25);
        System.out.println("result02 = " + result02);


        /*
        익명 클래스 (이름 없이 중괄호 열어서 객체 생성해서 사용 가능함)
        의도: 나는 곱셈계산기가 필요한데
        여기서만 쓰고 안 쓸 것 같아.
        객체를 한 번만 생성할 거 같아.
        **이름이 없어서 한 번 밖에 못 부름
        **이름이 없어도 어떤 명세서로 만든 건지는 알려줘야 함
        **추상클래스와 인터페이스에서 동작 가능함
         */
        //                   class MultiCalculator implements Calculator
        Calculator multuCal = new Calculator() {
             //클래스 블록 내부
            //필드랑 메서드 만들 수 있음
            //private int a;

            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        Calculator divCal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 / n2;
            }
        };
        
        int result3 = multuCal.operate(6,11);
        System.out.println("result3 = " + result3);

        //Restaurant italian = new Restaurant();//추상 클래스명으로 객체 생성 불가
        Restaurant italian = new Restaurant() { //객체 생성 영역이 아닌 클래스 정의 영역이 됨
                                                //오버라이딩 필수
            private String ownerChefName;
            public void makePasta(){
            }
            @Override
            public void cook() {
                System.out.println("이탈리안 요리를 만듭니다.");
            }
            @Override
            public void reserve() {
                System.out.println("이탈리안 레스토랑 예약을 받습니다.");
            }
        };

        italian.cook();
        italian.reserve();



    }
}