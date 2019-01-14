package Chapter5;

public class ExtendParentWODefaultConstructor {
    public ExtendParentWODefaultConstructor(int arg) {

    }

//    public class Child extends ExtendParentWODefaultConstructor {
//         // DOES NOT COMPILE
//         // There is no default constructor available in ExtendParentWODefaultConstructor
//    }

//    public class Child2 extends ExtendParentWODefaultConstructor {
//        public Child2() {
//            // DOES NOT COMPILE
//        }
//    }

    public class Child3 extends ExtendParentWODefaultConstructor {
        public Child3() {
            super(10);
        }
    }
}
