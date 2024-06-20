package interfaces;

import java.util.ArrayList;

public class Main_HW {
    public static void main(String[] args) {
        Headteacher headteacher = new Headteacher();
        Programmer programmer = new Programmer();
        Cook cook = new Cook();
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();

        workers.add(programmer);
        workers.add(cook);

        drivers.add(programmer);
        drivers.add(cook);
        for (Worker i : workers){
            i.work();
        }
        for( Driver i : drivers){
            i.drive();
        }
    }
}