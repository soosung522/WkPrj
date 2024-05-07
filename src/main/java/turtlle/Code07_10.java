package turtlle;

class Rabbit2 {
    String shape;
    int xPos;
    int yPos;
    Rabbit2() {
        shape = "토끼";
    }
    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

public class Code07_10 {
    public static void main(String[] args) {
        Rabbit2 rabbit1 = new Rabbit2();

        System.out.println("rabit : " + rabbit1.shape);
    }
}
