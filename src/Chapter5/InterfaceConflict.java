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



//    public interface Human implements Omnivore {
        // DOES NOT COMPILE
        // No implements cause allowed for instance
        // Interfaces must extend other interfaces, they cant implement them
//    }

    public interface Human extends Omnivore {
        void shoot();
    }

    public class Adam implements Human {
        @Override
        public void eatPlants() {}

        @Override
        public void shoot() {}
    }
}
