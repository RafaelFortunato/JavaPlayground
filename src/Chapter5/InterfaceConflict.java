package Chapter5;

public class InterfaceConflict {

    public interface Herbivore {
        public int eatPlants();
    }

    public interface Omnivore {
        public void eatPlants();
    }

    // 'eatPlants()' in Omnivore clashes with 'eatPlants()' in Herbivore;
    // methods have unrelated return types

//    public interface Supervore extends Herbivore, Omnivore {
        // DOES NOT COMPILE
//    }

//    public abstract class AbstractBear implements Herbivore, Omnivore {
        // DOES NOT COMPILE
//    }
}
