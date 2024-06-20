package inheritance;

public class Cat extends CatFamily{
    public Cat(){
        super(2,2,false);
        legs = 4;
    }
    @Override // Через CTRL + P можно быстро создать переопределенный метод
    public void eat(){
        super.eat(); // обращается к родительскому классу и запускает еданный метод
        System.out.println("Wiskas");
    }
}
