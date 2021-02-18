package algo;

import java.util.Arrays;
import java.util.List;

class Solution {
    //    public static void main(String[] args) {
//        //Input
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] s = new String[n];
//        for (int i = 0; i < n; i++) {
//            s[i] = sc.next();
//        }
//        sc.close();
//
//        //Write your code here
//
//        Arrays.sort(s, (Comparator<Object>) (a1, a2) -> {
//            BigDecimal bigDec1 = new BigDecimal((String) a1);
//            BigDecimal bigDec2 = new BigDecimal((String) a2);
//            return bigDec2.compareTo(bigDec1);
//        });
//        //Output
//        for (int i = 0; i < n; i++) {
//            System.out.println(s[i]);
//        }
//    }
    public static void main(String[] args) {
        List<String> products = Arrays.asList("eggs", "milk", "cheese");
        List<Float> productPrice = Arrays.asList(2.89f, 3.29f, 5.79f);
        List<String> productSold = Arrays.asList("eggs", "eggs", "cheese", "milk");
        List<Float> soldPrice = Arrays.asList(2.89f, 2.99f, 5.97f, 3.29f);
        int wrongTotal = 0;
        for (int i = 0; i < productSold.size(); i++) {
            int indexOfItem = products.indexOf(productSold.get(i));
            Float actualPrice = productPrice.get(indexOfItem);
            Float sellingPrice = soldPrice.get(i);
            if (actualPrice.compareTo(sellingPrice) != 0) {
                wrongTotal = wrongTotal + 1;
            }
        }
        System.out.println("number of errors : " + wrongTotal);
    }

}