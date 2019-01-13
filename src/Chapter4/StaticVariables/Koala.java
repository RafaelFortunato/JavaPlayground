package Chapter4.StaticVariables;

public class Koala {

    static int count = 5;

    /**
     * Believe it or not, this code outputs 5 twice. Line 15 sees that k is a Koala and count is a
     * static variable, so it reads that static variable. Line 17 does the same thing. Java doesn’t care
     * that k happens to be null. Since we are looking for a static, it doesn’t matter.
     */
    public static void main(String[] args) {
        Koala k = new Koala();
        System.out.println(k.count);
        k = null;
        System.out.println(k.count); // Prints 5, no NullPointer
    }
}
