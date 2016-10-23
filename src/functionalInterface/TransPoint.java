package functionalInterface;

/**
 * Created by hldo on 24/10/16.
 */
public class TransPoint {
    int x;
    int y;

    public TransPoint(int _x, int _y) {
        x = _x;
        y = _y;
    }

    void transpose() {
        int t = x;
        x = y;
        y = t;
    }

    void printOut() {
        System.out.println(x + "\t" + y);
    }
}