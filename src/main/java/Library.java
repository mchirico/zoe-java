import java.util.ArrayList;
import java.util.Iterator;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
    boolean someLibraryMethod() {
        return true;
    }

    Double mean(ArrayList<Double> m) {
        double sum = 0;
        for (Double d : m) {
            sum += d;
        }
        return sum / m.size();
    }
}

