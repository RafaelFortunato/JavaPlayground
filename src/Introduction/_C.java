package Introduction;

public class _C {


     public static void main(String[] main) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
     }

//     public static void main(String[] args) {
//        int[] array = { 6, 9, 8 };
//        List<Integer> list = new ArrayList<>();
//        list.add(array[0]);
//        list.add(array[2]);
//        list.set(1, array[1]);
//        list.remove(0);
//        System.out.println(list);
//     }

}