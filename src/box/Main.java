package box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        MyNewBox boxpaperboard = new MyNewBox(10,"paperboard");
        WeightBox boxweight = new WeightBox(10, 20);
        box.showInfo();
        boxweight.showInfo();
        boxpaperboard.showInfo();

    }
}
