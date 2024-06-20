package cafe;

public class OfficiantBob implements Officiant{
    @Override
    public void getOrder() {
        System.out.println("Принял заказ");
    }
}
