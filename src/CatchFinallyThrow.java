public class CatchFinallyThrow {
    public static void main(String args[]) throws Exception {
        throwException();
    }

    public static void throwException() throws Exception {
        try {
            throw new Exception("1");
        } catch (Exception e) {
            throw new Exception("2");
        } finally {
            throw new Exception("3");
        }
    }
}
