package Introduction;

public class Egret {

    private String color = "green";
    { this.color = "blue"; }

    public Egret() {
        this("white");
    }

    public Egret(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
}