public class JavaPointers {

    static class Container {
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
        Container a, b;

        a = new Container("a");
        b = new Container("b");

        a = b; // Container A is no longer accessible, therefore eligible for garbage collection

        Container c = a;

        c.setName("c"); // Modifying the object that all pointers are referring to

        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
    }
}
