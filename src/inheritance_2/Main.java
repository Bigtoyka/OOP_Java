package inheritance_2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
//        Waiter waiter1 = new Waiter(); Можно испольнить по-другому, чтобы не создаать обхект, сразу передать в метод интерфейс
        client1.force(new Actions() {
            @Override
            public void getOrder(String dish) {
                System.out.println("Your order is " + dish);
            }
        }, "pizza");
    }
}
