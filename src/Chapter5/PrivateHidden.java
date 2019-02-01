package Chapter5;

public abstract class PrivateHidden {

    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        PrivateHidden bird = new Pelican();
        bird.fly();
    }

}

class Pelican extends PrivateHidden {

    protected void fly() {
        System.out.println("Pelican is flying");
    }

}
