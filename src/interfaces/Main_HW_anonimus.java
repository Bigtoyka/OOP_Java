package interfaces;

public class Main_HW_anonimus {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeOrder(new Officiant() {
            @Override
            public void getOrder(String name) {
                System.out.println("Я принес вам " + name);

            }
        }, "pizza");

    }
}
