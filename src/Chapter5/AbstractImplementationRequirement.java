package Chapter5;

public class AbstractImplementationRequirement {
    public abstract class Animal {
        public abstract String getName();
    }

    public abstract class Fish {

    }

//    public class Bird extends Animal { // DOES NOT COMPILE
        // What would happen if someone tried to call bird.getName()?
//    }

//    public class Flamingo extends Bird {
//        public String getName() {
//            return "Flamingo";
//        }
//    }



    interface Walkable {
        void walk();
    }

    interface Jumpable {
        String walk();
    }

//    static class Entity implements Walkable, Jumpable {

//        @Override
//        public String walk() { // DOESNT COMPILE, Clash implementations
//            System.out.println("Entity");
//            return null;
//        }
//    }
}
