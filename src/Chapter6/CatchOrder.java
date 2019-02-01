package Chapter6;

public class CatchOrder {
    public static void main(String[] args) {
        System.out.println(exceptions());
        // before catch finally done
    }

    public static String exceptions() {
        String result = "";
        String v = null;

        try {
            try {
                result += "before ";
                v.length();
                result += "after ";
            } catch (NullPointerException e) {
                result += "catch ";
                throw new RuntimeException("Catch Exception");
            } finally {
                result += "finally ";
                throw new Exception("Finally Exception");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result += "done ";
        }

        return result;
    }
}
