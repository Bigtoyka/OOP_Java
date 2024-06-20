package inheritance;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3);
        Rectangle_2 rectangle = new Rectangle_2(4,5);
        System.out.println(triangle.getPerimeter());
        System.out.println(rectangle.getPerimeter());
        triangle.showPerimeter(); // можно так, сразу в классе добавили вывод по getPerimeter()
        ColorRectangle_2 colorRectangle = new ColorRectangle_2(4,5);
        colorRectangle.showPerimeter();
    }

}
