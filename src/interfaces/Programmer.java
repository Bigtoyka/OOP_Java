package interfaces;

public class Programmer implements Worker,Driver {
    @Override
    public void work() {
        System.out.println("Programmer working");
    }

    @Override
    public void drive() {
        System.out.println("Programmer driving");

    }
}
