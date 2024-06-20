package interfaces;

public class Client{

    public void makeOrder(Officiant officiant, String name) {
        officiant.getOrder(name);
    }
}
