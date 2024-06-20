package box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        this(10);
    }

    public Box(Box another) {          // Нужен для того, что если мы передадим туда уже готовую коробку, то другая коробка примет такие же данные как первая
        this(another.length, another.width, another.height);
    }

    public Box(double size) {
        this(size, size, size);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = length;
        this.height = length;
    }

    public Box copy() {               // В качествее возвращаемого метода, может быть использован любой тип данных
        return new Box(this.length, this.width, this.height);
    }

    public Box increased() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    public int compare(Box another) {
        double currentValue = getValue();
        double anotherValue = another.getValue();
        if (currentValue > anotherValue) {
            return 1;
        } else if (currentValue < anotherValue) {
            return -1;
        } else {
            return 0;
        }
    }

    public void showInfo() {
        System.out.println("Length: " + this.length + " Width: " + this.width + " Height: " + this.height);
    }

    public double getValue() {
        return length * width * height;
    }

    public void showValue() {
        System.out.println(getValue());
    }
}
