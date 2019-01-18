import java.util.ArrayList;
import java.util.Arrays;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("anim");
        sb.append("als");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch); // anim 7 s

        StringBuilder sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println(sb2); // 1c-true

        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7, "-");
        sb3.insert(0, "-");
        sb3.insert(4, "-");
        System.out.println(sb3); // -ani-mals-

        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add("wut?");
        list1.add(sb3);
        for (Object e : list1)
            System.out.println(e);
//        Arrays.toString(list1);
    }
}
