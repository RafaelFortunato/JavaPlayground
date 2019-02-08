package Chapter2;

public class ShortSum {
    public static void main(String[] args) {
        short a = 4;
        short b = 3;
//        short c = a + b; // Incompatible types, required short, found int
//        short d = (short) a + b;
        short e = (short) (a + b);

        byte f = 1;
        byte g = 2;
//        byte h = f + g; // Incompatible types, required byte, found int

        float i = g + f;
    }
}
