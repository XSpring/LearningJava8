package functionalInterface;

/**
 * Created by locdh on 10/23/16.
 */
public class SAMInterfaces {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Created and running...");
            }
        }).start();
    }

    @FunctionalInterface
    public interface simpleFuncInterface {
        public void doWork();
        public String toString();
        public boolean equals(Object o);
//        public boolean isFunctional(); // Flag error for multiple non-overriding
                                         // abstract method
    }
}
