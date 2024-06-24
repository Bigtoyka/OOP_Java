package inheritance_2;

public class Waiter implements Actions {
    @Override
    public void getOrder(String dish) {
        System.out.println("Your order is " + dish);
    }
}
