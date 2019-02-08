package Chapter1;

public class FloatAssigns {
    public static void main(String[] args) {
        float value1 = 102;
        float value2 = (int) 102.0;
//        float value3 = 1f * 0.0; // Found double
        float value4 = 1f * (short) 0.0;
//        float value5 = 1f * (boolean)0; // Cannot cast int to boolean


        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }
}
