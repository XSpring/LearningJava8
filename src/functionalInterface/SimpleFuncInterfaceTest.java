package functionalInterface;

/**
 * Created by locdh on 10/23/16.
 */
public class SimpleFuncInterfaceTest {
    public static void main(String[] args) {
        carryOutWork(new SimpleFuncInterface() {
            @Override
            public void doWork() {
                System.out.println("Do in SimpleFunc impl...");
            }
        });

        carryOutWork(() -> System.out.println("Do in lambda expression impl..."));
    }

    public static void carryOutWork(SimpleFuncInterface sfi) {
        sfi.doWork();
    }

    @FunctionalInterface
    public interface SimpleFuncInterface {
        public void doWork();
    }
}
