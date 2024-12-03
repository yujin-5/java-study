package practice.dec03_1;

public class ShapeManager {
    public void printShapeInfo(Shape shape){
        System.out.println("면적 = " + shape.area());
        System.out.println("둘레 = " + shape.perimeter());
    }

    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        manager.printShapeInfo(circle);
        manager.printShapeInfo(rectangle);

    }


}
