public class ArraysTest {

    public static void main(String args[]) {
//        Both "String[] name" and "String name[]" are correct ways to declare an array.
        String[] a;
        String b[];

//        String c[] = new String[]; WRONG!
        String d[] = new String[4];
        String e[]= {"a", "b", "c"};
        String emptyArray[] = {};
        String nonInitializedArray[];

        for (String s : emptyArray) {
            System.out.println(s); // Won't be executed
        }

//        for (String s : nonInitializedArray) { // Error: Might not have been initialized.
//            System.out.println(s);
//        }

        System.out.println(e); // [Ljava.lang.String;@3ac3fd8b

        for (String s : args) {
            System.out.println(s); // Print any argument passed in the execution
        }
    }
}
