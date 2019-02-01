package Chapter5;

public class InterfaceDefault {
    public interface HasFins {
        public default int getNumberOfFins() {
            return 4;
        }

        public default double getLongestFinLength() {
            return 20.0;
        }

        public default boolean doFinsHaveScales() {
            return true;
        }
    }

    public interface SharkFamily extends HasFins {
        public default int getNumberOfFins() { // Overriding default method
            return 8;
        }

        public double getLongestFinLength(); // Makes it necessary to be implemented, again

//        public boolean doFinsHaveScales() { // DOES NOT COMPILE, missing default
//            return false;
//        }
    }

    // ---------- Default Implementation Conflicts
    public interface Walk {
        public default int getSpeed() {
            return 5;
        }
    }

    public interface Run {
        public default int getSpeed() {
            return 10;
        }
    }

//    public class Cat implements Walk, Run {
//        // DOES NOT COMPILE
//    }

    public class Dog implements Walk, Run {
        // OK
        public int getSpeed() {
            return 7;
        }
    }

    // ---------- Static Interface Methods
    public interface Hop {
        static int getJumpHeight() {
            return 8;
        }
    }

    class Bunny implements Hop {

    }

    public static void main(String[] args) {
        System.out.println(Hop.getJumpHeight());
//        System.out.println(Bunny.getJumpHeight());  // DOES NOT COMPILE
    }
    
}
