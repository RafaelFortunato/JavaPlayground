import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import static java.util.Collections.*;

public class PredicateTest {

    public static class Character {
        static int hp = 50;

        public boolean isAlive(Predicate<Integer> formula) {
            return formula.test(hp);
        }
    }

    public static class CustomComparator implements Comparator<Character> {
        @Override
        public int compare(Character o1, Character o2) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(callTest(i -> i > 5));
        // System.out.println(test(i -> {i == 5;}));
        System.out.println(callTest((i) -> i == 5));
        // System.out.println(test((int i) -> i == 5);
        // System.out.println(test((int i) -> {return i == 5;}));
        System.out.println(callTest((i) -> {
            return i == 5;
        }));

        System.out.println("CallTest2: " + callTest2(8, 5, (a, b) -> a > b));

        Character c = new Character();
        System.out.println("IsAlive: " + c.isAlive(i -> i > 0));

        Character nullC = null;
        System.out.println(nullC.hp);

        ArrayList<Character> chars = new ArrayList<>();
        sort(chars, new CustomComparator());
    }

    private static boolean callTest(Predicate<Integer> p) {
        return p.test(5);
    }

    private static boolean callTest2(int a, int b, BiPredicate<Integer, Integer> p) {
        return p.test(a, b);
    }

}