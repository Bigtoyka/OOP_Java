package interfaces;public class Main_HW {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Director director = new Director();
        Programmer programmer = new Programmer();
        chef.work();
        director.work();
        programmer.work();
    }
}
