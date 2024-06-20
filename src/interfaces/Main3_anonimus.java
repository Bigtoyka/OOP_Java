package interfaces;

public class Main3_anonimus {
    public static void main(String[] args) {
        Headteacher headteacher = new Headteacher();
        headteacher.force(new Worker() {
            @Override
            public void work() {
                System.out.println("Работаю");
            }
        });

    }
}
