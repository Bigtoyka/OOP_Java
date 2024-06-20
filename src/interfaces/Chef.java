package interfaces;

public class Chef implements Worker{
    @Override
    public void work() {
        System.out.println("Chef working");
    }
}
