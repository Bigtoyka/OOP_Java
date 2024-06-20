package interfaces;

import java.util.ArrayList;

public class Main2_Upcast {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<AbleToRun> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        for (AbleToRun animal : animals) {
            animal.run(); // не могли вызвать метода run(),пока был тип Animal, потому что как раз произошел UPcast. В род. классе метода run() нет.
        }// Решили с помощью интерфейсов
        AbleToFly ableToFly = new Bird();
        ableToFly.fly();
    }
}
