package Introduction;

import java.util.Arrays;
import java.util.List;

class Chicken {
}

interface HenHouse {
    public java.util.List<Chicken> getChickens();
}

class Farm implements HenHouse {

    @Override
    public List<Chicken> getChickens() {
        return Arrays.asList(new Chicken());
    }
}

public class ChickenSong {
    public static void main(String[] args) {
        HenHouse house = new Farm();
        Chicken chicken = house.getChickens().get(0);
        for (int i = 0; i < house.getChickens().size(); chicken = house.getChickens().get(i++)) {
            System.out.println("Cluck");
        }
    }
}