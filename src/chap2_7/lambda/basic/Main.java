package chap2_7.lambda.basic;

public class Main {

    public static void order(Pet pet){
        pet.eat();
    }

    public static void main(String[] args) {

        Pet dog = new Pet(){
            @Override
            public void eat() {
                System.out.println("강아지는 사료를 먹어요.");
            }
        };

        order(dog);
        order(() -> {
            //파라미터랑 오버라이딩 메서드 생략할수 있음
            //가운데에 화살표 넣어주면
            //그것이 바로 람다 표현식..!
            System.out.println("금붕어는 플랑크톤을 먹어요");
        });
    }
}