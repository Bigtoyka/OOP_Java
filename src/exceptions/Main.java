package exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a; // на данном этапе код прекращет свое выполнение в блоке try, если a = 0, дальше ошибки игнорируются
            int c = Integer.parseInt("asasfa");
        } catch(ArithmeticException e) {
            System.out.println("Поймано исключение " + e.getClass());
        } catch (Exception e1) {
            System.out.println("На 0 делить нельзя");
        }

        System.out.println("Hello");
    }
}
