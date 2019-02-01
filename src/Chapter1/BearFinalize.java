package Chapter1;

public class BearFinalize {
    protected void finalize() {
        System.out.println("Roar!");
    }

    public static void main(String[] args) {
        BearFinalize bear = new BearFinalize();
        bear = null;
//        System.gc();
    }
}