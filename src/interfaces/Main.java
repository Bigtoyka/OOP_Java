package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        animals.add(fish);
        for(Animal animal : animals){
            animal.eat();
        }// данное действие называется Upcast - приведение к родительскому типу
        Animal animal1= new Dog(); // Приводим собаку к родительскому классу => у нее методы только родителя!
        animal1.eat();
        Dog dog1= (Dog) animal1;
        dog1.run();
    }
}
