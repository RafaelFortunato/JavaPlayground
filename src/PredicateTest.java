import java.util.function.Predicate;

public class PredicateTest {

    public static class Character {
        int hp = 50;

        public boolean isAlive(Predicate<Integer> formula) {
            return formula.test(hp);
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

        Character c = new Character();
        System.out.println("IsAlive: " + c.isAlive(i -> i > 0));
    }

    private static boolean callTest(Predicate<Integer> p) {
        return p.test(5);
    }

}