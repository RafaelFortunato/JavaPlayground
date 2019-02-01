package Chapter3;

public class AnonymousArray {

    public static void main(String[] args) {
//        anonymousArray({10, 22, 44, 66}); // WRONG!
        anonymousArray(new int[]{10, 22, 44, 66});
    }

    static void anonymousArray(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
