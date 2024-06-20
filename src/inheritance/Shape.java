package inheritance;

public abstract class Shape {
    private int a;
    private int b;
    Shape(int a, int b) { // теперь суперы вызывать обязательно в дочерних классах
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public abstract int getPerimeter(); // В данном случае мы создаем абстрактный метод, который ОБЗАТЕЛЬНО надо будет переопределить, вызвать его как метод ниже нельзя.
//    public int getPerimeter(){
//        return 0; //Указали 0, потому что уверенны, что в классах наследниках данный класс переопределится
//    }
    public void showPerimeter(){
        System.out.println(getPerimeter());
    }
}
