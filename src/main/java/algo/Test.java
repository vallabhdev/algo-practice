package algo;

@FunctionalInterface
public interface Test {
    public void apply(String t);

    private static void doSomething(String m) {
        System.out.println("");
    }

    default void doSomethingAgain(String m) {
        System.out.println("");
    }

    public String toString();

}
