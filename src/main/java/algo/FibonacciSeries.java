package algo;

public class FibonacciSeries {
    static int curr = 1, prev = 0, sum, count = 10;

    public static void main1(String[] args) {
        int curr = 1, prev = 0, sum;
        System.out.print(prev + "," + curr);
        for (int i = 2; i < 10; i++) {
            sum = prev + curr;
            prev = curr;
            curr = sum;
            System.out.print("," + sum);
        }
    }

    public static synchronized void main(String[] args) {
        System.out.print(prev + "," + curr);
        printSeries(count - 2);
    }

    private static void printSeries(int count) {
        if (count > 0) {
            sum = prev + curr;
            prev = curr;
            curr = sum;
            System.out.print("," + sum);
            printSeries(count - 1);
        }
    }
}
