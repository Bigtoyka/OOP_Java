package cafe;

public class Main {
    public static void main(String[] args) {
        Client client = new cafe.Client();
        OfficiantBob officiantBob = new OfficiantBob();
        client.force(officiantBob);
    }
}
