package Chapter3;

import java.util.ArrayList;

public class ListRemoveAutoBoxing {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(0);
        System.out.println(num.remove(1));
    }
}
