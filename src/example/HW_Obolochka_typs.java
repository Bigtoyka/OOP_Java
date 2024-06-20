package example;

public class HW_Obolochka_typs {
    public static void main(String[] args) {
        String s = "This is Jone. He is 27 years old.";
        String name = s.substring(8,12);
        int age = Integer.parseInt(s.substring(20,22));
        System.out.println(age);
        Person Jone = new Person(name, age);
        System.out.println("Jone's name is " + Jone.getName() + " and age is " + Jone.getAge());
    }
}
