package algo;

public class UseSingle {
    public static void main(String[] args) {
        SingleTonTest instance = SingleTonTest.getInstance();
        SingleTonTest instance2 = SingleTonTest.getInstance();
        System.out.println(instance2 == instance);
    }
}
