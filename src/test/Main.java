package test;

import example.MyArrayList;
import example.Person;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i ++) {
            int number = random.nextInt(1,7);
            String res = String.format("Ваше число: %s ", number);
            System.out.print(res);
        }
    }
}

