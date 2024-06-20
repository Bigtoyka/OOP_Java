package interfaces;

public class Bird extends Animal implements AbleToFly, AbleToRun{
    @Override
    public void eat() {
        System.out.println("bird food");
    }

    @Override
    public void fly() {
        System.out.println("bird fly");

    }

    @Override
    public void run() {
        System.out.println("bird run");
    }
}
