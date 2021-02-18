package algo;

public final class SingleTonTest {
    private static SingleTonTest instance;

    private SingleTonTest() {
    }

    public static SingleTonTest getInstance() {
        if (instance == null) {
            instance = new SingleTonTest();
        }
        return instance;
    }
}
