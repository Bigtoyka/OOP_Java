package interfaces;

public class Cook implements Worker,Driver{
    @Override
    public void work() {
        System.out.println("Cook working");
    }

    @Override
    public void drive() {
        System.out.println("Cook driving");
    }
}
