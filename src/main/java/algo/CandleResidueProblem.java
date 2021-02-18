package algo;

public class CandleResidueProblem {
    public static void main(String[] args) {
        System.out.println(getMaxCount(50, 1, 5)); // 62
        System.out.println(getMaxCount(10, 2, 5)); // 6
        System.out.println(getMaxCount(10, 2, 2)); // 9
        System.out.println(getMaxCount(6, 2, 2)); // 5
        System.out.println(getMaxCount(1, 1, 1)); // 2
    }

    private static int getMaxCount(int amount, int cost, int reusable) {
        int totalCandles = amount / cost;
        return getTotal(totalCandles, reusable);
    }

    private static int getTotal(int totalCandles, int reusable) {
        int quotient = totalCandles / reusable;
        int remainder = totalCandles % reusable;
        if (totalCandles > reusable) {
            if (remainder == 0) {
                return totalCandles + getTotal(quotient, reusable);
            } else {
                return (totalCandles - remainder) + getTotal(quotient + remainder, reusable);
            }
        } else if (totalCandles == reusable) {
            return totalCandles + quotient;
        } else {
            return totalCandles;
        }
    }
}
