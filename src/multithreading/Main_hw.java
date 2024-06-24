package multithreading;

import java.util.Random;

public class Main_hw {
    static boolean isWinner = false;

    public static void main(String[] args) {
        int bound = 1_000_000;
        Random random = new Random();
        int number_master = random.nextInt(bound);
        System.out.println(String.format("Искомое число: %s", number_master));
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int number1;
                do {
                    number1 = random.nextInt(bound);
                    System.out.println(number1);
                } while (number1 != number_master);
                isWinner = true;
                System.out.println("Отгаданное число " + number1);
            }
        });
        thread.start();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    if(isWinner){
                        System.out.println("Затрачено времени на поиск: " + i);
                        break;
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread1.start();
    }

}
