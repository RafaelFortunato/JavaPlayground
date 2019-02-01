package Introduction;

class IntObj {
    public int val;
    IntObj(int val) {
        this.val = val;
    }
}

public class BearOrShark {
    // public static void main(String[] args) {
    // int luck = 10;
    // if ((luck > 10 ? luck++ : --luck) < 10) {
    // System.out.print("Bear");
    // }
    // if (luck < 10)
    // System.out.print("Shark");
    // }


    public static void main(String[] args) {
        int a = 10;
        Integer b = 10;
        IntObj c = new IntObj(10);

        alterInt(a, b, c);

        System.out.println("Primitive Int: " + a);
        System.out.println("Java Integer: " + b);
        System.out.println("Object with primitive int: " + c.val);

        lenghtTest();
    }

    private static void lenghtTest() {
        String a = "123";
        int[] b = {1, 2, 3};

        System.gc();
        System.out.println(a.length());
        System.out.println(b.length); // Arrays don`t use parentheses ()
    }

    public static void alterInt(int a, Integer b, IntObj c) {
        a = 20;
        b = 20;
        c.val = 20;
    }


}