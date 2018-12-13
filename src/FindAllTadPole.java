//import java.util.ArrayList;
//import java.util.List;
//
//public interface CanSwim {
//}
//
//public class Amphibian implements CanSwim {
//}
//
//class Tadpole extends Amphibian {
//}
//
//public interface Animal {
//    public default String getName() {
//        return null;
//    }
//}
//
//interface Mammal {
//    public default String getName() {
//        return null;
//    }
//}
//
//abstract class Otter implements Mammal, Animal {
//    @Override
//    abstract public String getName();
//}
//
//public class FindAllTadPole {
//    public static void main(String[] args) {
//        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
//        for (Amphibian amphibian : tadpoles) {
//            CanSwim tadpole = amphibian;
//            // Long tadpole2 = amphibian;
//            Amphibian tadpole3 = amphibian;
//            // Tadpole tadpole4 = amphibian;
//            Object tadpole5 = amphibian;
//        }
//        System.out.println("Success");
//    }
//}