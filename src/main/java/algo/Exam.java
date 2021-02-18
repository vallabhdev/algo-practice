package algo;

import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam extends Solution {

    public static void main(String[] args) {

    }

    public static void ipAddressFinder(String[] args) throws Exception {
        String s = "000.12.12.034";
        String numbers = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String delimiter = "\\.";
        String ipRegex = numbers + delimiter + numbers + delimiter + numbers + delimiter + numbers;
        Pattern pattern = Pattern.compile(ipRegex);
        System.out.println(s.matches(pattern.pattern()));
    }

    public static void findAnnagram(String[] args) {
        String a = "TRIANGLE".toUpperCase(Locale.ROOT);
        String b = "INTEGRAL".toUpperCase(Locale.ROOT);
        if (a.length() != b.length()) {
            System.out.println("false");
        } else {
            char[] ac = a.toCharArray();
            char[] bc = b.toCharArray();
            int count1[] = new int[256];
            int count2[] = new int[256];
            for (int i = 0; i < ac.length && i < bc.length; i++) {
                count1[ac[i]]++;
                count2[bc[i]]++;
            }
            for (int i = 0; i < 256; i++) {
                if (count1[i] != count2[i]) {
                    System.out.println("false");
                }
            }
            System.out.println("true");
        }
    }

    public static void findAnagramUsingHashMap(String[] args) {
        String a = "TRIANGLEE";
        String b = "INTEGRAL";
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        mapToCount(a, aMap);
        mapToCount(b, bMap);
        System.out.println(bMap.equals(aMap));
    }

    private static void mapToCount(String value, HashMap<Character, Integer> map) {
        for (char each : value.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
    }

    public static void reserveStringWithOutStack(String[] args) {
        String value = "madam";
        char[] c = value.toCharArray();
        char[] res = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            res[i] = c[c.length - 1 - i];
        }
        System.out.println(value.compareTo(new String(res)));
    }

    public static void usingStack(String[] args) {
        String a = "12$34543$21";
        Stack<Character> stack = new Stack<>();
        for (char c : a.toCharArray()) {
            stack.push(c);
        }
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            b = b.concat(stack.pop().toString());
        }
        System.out.println(a.compareTo(b) == 0 ? "true" : "false");
    }
}
