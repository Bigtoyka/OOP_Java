package interfaces;

public class Programmer implements Worker{
    @Override
    public void work() {
        System.out.println("Programmer working");
    }
}
