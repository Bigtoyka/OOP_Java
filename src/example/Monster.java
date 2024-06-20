package example;

public class Monster {
    int eyes;
    int hands;
    int legs;


    Monster(int eyes, int hands, int legs){ // Основной конструктор
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    Monster(int size) {              // Конструктор на основе основного, 3 поле заполняются
        this(size, size, size);
    }

    Monster() {                      // Конструктор на оснве предыдущего, где передается 2, то есть все 3 параметра, данный конструктор по умолчанию
        this(2);
    }
    void voice(){
        voice(1);
    }
    void  voice(int count){
        voice(count, "arrrrrr....");
    }
    void voice(int count, String word){     // самый универсальный метод, значит его можно применить к остальным
        for (int i=0;i<count;i++){
            System.out.println(word);
        }
    }
}
