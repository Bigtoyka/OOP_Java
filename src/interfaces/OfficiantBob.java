package interfaces;

public class OfficiantBob implements Officiant{
    @Override
    public void getOrder(String name) {
        System.out.println("Я вам принес " + name);
    }
}
