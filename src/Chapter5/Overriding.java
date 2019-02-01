package Chapter5;

public class Overriding {
    public static class Bird {
        public String getName() {
            return "Unknown";
        }

        public void displayInformation() {
            System.out.println("The bird name is: " + getName());
        }
    }

    public static class Peacock extends Bird {
        public String getName() {
            return "Peacock";
        }
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
    }
}

class Rodent {
    protected static Number chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}
class Beaver extends Rodent {
    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}

class Bird {
    public static Integer fly() throws RuntimeException {
        System.out.println("Bird is flying");
        return 1;
    }
}

// DOES NOT COMPILE, 3 Errors
//class Seagull extends Bird {
//    protected static Number fly() throws Exception {
//        System.out.println("Seagull is flying over the sea");
//        return 2;
//    }
//}
