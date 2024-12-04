package chap1_9.final_;

class cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("야옹야옹~");
    }
//    @Override
//    public void eat(){
//        System.out.println("생선얌냠냠");
//    }
}

public class Animal {

    public void eat(){
        System.out.println("밥얌냠냠~");
    }
    public void makeSound(){
        System.out.println("동물의 울음소리~");
    }
}

//50개 다 쓰지마: final class
//50개 중 30개 쓰지마: final method