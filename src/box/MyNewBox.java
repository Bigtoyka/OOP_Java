package box;

public class MyNewBox extends Box {

    public String type;

    public MyNewBox() {
        this.type = "paperboard";
    }

    public MyNewBox(Box another, String type) {
        super(another);
        this.type = type;
    }

    public MyNewBox(double size, String type) {
        super(size);
        this.type = type;
    }

    public MyNewBox(double length, double width, double height, String type) {
        super(length, width, height);
        this.type = type;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(type);
    }
}
