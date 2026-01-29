
import java.util.function.Predicate;

public class TemparetureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> isHigh = t -> t > 40;
        System.out.println(isHigh.test(45.5));
    }
}
