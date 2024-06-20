package example;

public class Rectangle {
    float lenght;
    float width;

    void setParametrs(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }
    float getSquare(){
        return lenght * width;
    }
}
