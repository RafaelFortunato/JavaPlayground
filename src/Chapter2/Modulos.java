package Chapter2;

public class Modulos {
    public static void main(String[] args) {
        System.out.println(49 / 31);
        System.out.println(49 % 31);
        System.out.println(4.9 / 3.1);
        System.out.println(4.9 % 3.1);

        System.out.println("------");

        System.out.println(-49 / 31);
        System.out.println(-49 % 31);
        System.out.println(-4.9 / 3.1);
        System.out.println(-4.9 % 3.1);

        System.out.println("------");

        System.out.println(-49 / -31);
        System.out.println(-49 % -31);
        System.out.println(-4.9 / -3.1);
        System.out.println(-4.9 % -3.1);

        System.out.println("------");

        byte a = 100;
//        byte b = a + a; // Automacally converts to int, even tough both operands are byte.

        int c = Integer.MAX_VALUE;
        int d = c + c;
        System.out.println(d); // Prints -2

        float ac = 13;
        System.out.println(ac / 2);

//        int e = 4_000_000_000; // DOES NOT COMPILE, Integer number too large
        int f = 2_000_000_000 * 2; // COMPILES
        System.out.println(f); // -294967296


    }
}
