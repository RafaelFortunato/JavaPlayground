import java.util.ArrayList;
import java.util.List;

interface CanSwim {
}

class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

public class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
            CanSwim tadpole = amphibian;
            // Long tadpole2 = amphibian;
            Amphibian tadpole3 = amphibian;
            // Tadpole tadpole4 = amphibian;
            Object tadpole5 = amphibian;
        }
        System.out.println("Success");
    }
}