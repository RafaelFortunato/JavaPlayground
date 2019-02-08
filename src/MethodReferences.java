public class MethodReferences {

    private static class Container {
        String name;

        Container(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Container c = new Container("a");

        // Changes in the object persists
        changeObjectValue(c);
        System.out.println(c.getName());

        // Changes in the pointer does not persist
        changeParamPointer(c);
        System.out.println(c.getName()); // prints changed, not null pointer
    }

    private static void changeObjectValue(Container c) {
        c.setName("changed");
    }

    private static void changeParamPointer(Container c) {
        c = null;
    }
}
