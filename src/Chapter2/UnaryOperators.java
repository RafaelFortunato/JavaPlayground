package Chapter2;

public class UnaryOperators {
    public static void main(String[] args) {

//        int x = !5; // DOES NOT COMPILE
//        boolean y = -true; // DOES NOT COMPILE
//        boolean z = !0; // DOES NOT COMPILE
//        boolean zzz = 0; // DOES NOT COMPILE

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x); // 2
        System.out.println("y is " + y); // 7
//        int y = 4 * 5 / x-- + --x; // x assigned value of 4
//        int y = 4 * 5 / 4 + --x; // x assigned value of 3
//        int y = 4 * 5 / 4 + 2; // x assigned value of 2


//        long a = 10;
//        int b = 5;
//        b = b * a; // DOES NOT COMPILE

        long a = 10;
        int b = 5;
        b *= a; // Compound operator casts the result back to int

        long z = 5;
        long w = (z=3);
        System.out.println(z); // Outputs 3
        System.out.println(w); // Also, outputs 3
    }
}
