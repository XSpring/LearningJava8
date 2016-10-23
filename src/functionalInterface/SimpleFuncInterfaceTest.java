package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

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

        carryOutWork(() -> {
            System.out.println("Hello!");
            System.out.println("It's me...");
        });

        carryOutOperation(x -> x*x, 3);

        Object o = (Runnable) () -> System.out.println("Hi");

        List<TransPoint> array = new ArrayList<>();
        array.add(new TransPoint(1, 2));
        array.add(new TransPoint(2, 3));
        array.add(new TransPoint(3, 4));
        array.add(new TransPoint(4, 5));

        array.forEach(TransPoint::transpose);
        array.forEach(TransPoint::printOut);
    }

    public static void carryOutWork(SimpleFuncInterface sfi) {
        sfi.doWork();
    }

    public static void carryOutOperation(IntOperation iO, int i) {
        System.out.println(iO.operate(i));
    }

    @FunctionalInterface
    public interface SimpleFuncInterface {
        public void doWork();
    }

    @FunctionalInterface
    public interface IntOperation {
        int operate(int i);
    }

}
