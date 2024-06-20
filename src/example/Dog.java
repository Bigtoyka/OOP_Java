package example;

public class Dog {
    String name;
    String breed;
    double weight;
    int speed;

    String info() {
        return "Имя: " + name + ", Порода: " + breed + ", Вес: " + weight;
    }

    double showVol() {
        double vol = weight * 2;
        System.out.println(vol);
        return vol;
    }

    /* Метод можно изменить на дургой возвращаемый тип - void, в этом случае return не нужен, он просто выполнит действия
     * и ничего не вернет*/
    void showVolVoid() {
        double vol = weight * 2;
        System.out.println(vol);
    }

    void getSpeed() {
        for(int i=0; i<speed; i++){
            System.out.println("Бегу");
        }
    }
}
