package Enum;

public class MainEnum {
    public static void main(String[] args) {
        print(ChildEnum.VALUE_B);
    }

    public static void print(ParentEnum customEnum) {
        System.out.println(customEnum.getValue());
    }
}
