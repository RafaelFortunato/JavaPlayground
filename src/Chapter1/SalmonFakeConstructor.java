package Chapter1;

public class SalmonFakeConstructor {
    int count;
    public void SalmonFakeConstructor() {
        count = 4;
    }

    public static void main(String[] args) {
        SalmonFakeConstructor s = new SalmonFakeConstructor();
        System.out.println(s.count);
    }
}

