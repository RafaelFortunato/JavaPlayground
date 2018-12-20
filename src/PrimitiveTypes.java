public class PrimitiveTypes {
    public static void main(String args[]) {
//        boolean a = 0; // DOES NOT COMPILE
        byte b = 0;
        short c = 0;
        int d = 0;
        long e = 0;
        float f = 0;
        double g = 0;
        char h = 0;

        // DOES NOT COMPILE
//        byte overflowByte = 128; // cannot convert int to byte
        byte maxByte = 127;
        byte minByte = -128;

//        short overflowShort = 32768;
        short maxShort = 32767;

//        int overflowInt = 2147483648;
        int maxInt = 2147483647;

//        long okLong = 2147483648; // Integer number too large
        long okLong = 2147483648L; // now Java knows it is a long

        System.out.println("Max Boolean: " + Boolean.TRUE);
        System.out.println("Min Boolean: " + Boolean.FALSE);

        System.out.println("Max Byte: " + Byte.MAX_VALUE);
        System.out.println("Min Byte: " + Byte.MIN_VALUE);

        System.out.println("Max Short: " + Short.MAX_VALUE);
        System.out.println("Min Short: " + Short.MIN_VALUE);

        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Integer: " + Integer.MIN_VALUE);

        System.out.println("Max Long: " + Long.MAX_VALUE);
        System.out.println("Min Long: " + Long.MIN_VALUE);

        System.out.println("Max Float: " + Float.MAX_VALUE);
        System.out.println("Min Float: " + Float.MIN_VALUE);

        System.out.println("Max Double: " + Double.MAX_VALUE);
        System.out.println("Min Double: " + Double.MIN_VALUE);

        System.out.println("Max Character: " + Character.MAX_VALUE);
        System.out.println("Min Character: " + Character.MIN_VALUE);

        int oc = 0100;
        System.out.println("Octal: " + oc);


    }
}
