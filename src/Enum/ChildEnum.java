package Enum;

public enum ChildEnum implements ParentEnum {
    VALUE_A {
        public int getValue() {
            return 1;
        }
    },

    VALUE_B {
        public int getValue() {
            return 2;
        }
    }
}
