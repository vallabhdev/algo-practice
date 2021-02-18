package algo;

import java.util.ArrayList;
import java.util.List;

class Trail extends Exam {

    public static void main(String[] a) {

    }

    public static void main1(String[] args) {
        String a = "hellojava";//{hel,ell,llo,loj,oja,jav,ava}
        int k = 3;
        String curr = a.substring(0, k);
        System.out.println(a);
        String smallest = curr, largest = curr;
        for (int i = 0; i <= a.length() - k; i++) {
            curr = a.substring(i, i + k);
            if (curr.compareTo(smallest) < 0) {
                smallest = curr;
            }
            if (curr.compareTo(largest) > 0) {
                largest = curr;
            }
        }
        System.out.println(smallest + "\n" + largest);
    }

    public static void lexo(String[] args) {
//        System.out.println("hello".compareTo("java") < 0 ? "hello java" : "java hello");
        String s = "hellojava";//{hel,ell,llo,loj,oja,jav,ava}
        int k = 3;
        List<String> lexos = new ArrayList<>();
        int size = s.length();
        for (int i = 0; i <= size - k; i++) {
            System.out.println(i);
            lexos.add(s.substring(i, i + k));
        }
        System.out.println(lexos);
        lexos.sort(String::compareTo);
        System.out.println(lexos);
        String smallest = lexos.get(0);
        String largest = lexos.get(lexos.size() - 1);
        System.out.println(smallest + "\n" + largest);
    }
}
