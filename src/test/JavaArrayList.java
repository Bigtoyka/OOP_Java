package test;

import java.util.ArrayList;

public class JavaArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();    // Java ArrayList, аналогичен нащему, как и методы
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        for (int i : list){
            System.out.println(i);
        }

    }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");

        return employees;
    }
}
