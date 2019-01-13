public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public void Deer() { System.out.print("Method");}

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    public String javaa = "a";

    // If this method was public, it would be overwritten
    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns()); // Prints false
    }

    static class Reindeer extends Deer {
        public Reindeer(int age) {
            System.out.print("Reindeer");
        }

        public boolean hasHorns() {
            return true;
        }
    }
}
