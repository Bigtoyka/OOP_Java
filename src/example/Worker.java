package example;

public class Worker {
    String name;
    String unit;
    float money;
    Worker(){
        this.name = "Не указано";
        this.unit = "Не указано";
        this.money = 1000;
    }
    Worker(String name, String unit, float money) {
        this.name = name;
        this.unit = unit;
        this.money = money;
    }
    void showInfo(){
        System.out.println(name + unit + money);
    }
}
