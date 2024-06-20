package inheritance;

public class Lione extends CatFamily{
    public Lione(){
        super(4,2,true);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("human");
    }
}
