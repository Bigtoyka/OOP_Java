package inheritance;

public class Rectangle_2 extends Shape{

    public Rectangle_2(int a, int b) {
        super(a, b);
    }

    @Override
    public int getPerimeter() {
        return 2*(getA()+getB());
    }
}
