package inheritance;

public class Triangle extends Shape{

    public int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    @Override
    public int getPerimeter() {
        return getA()+getB()+getC();
    }
}
