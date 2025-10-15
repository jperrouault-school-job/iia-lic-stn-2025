import java.util.ArrayList;
import java.util.List;

public class AppExo4 {
    public static void main(String[] args) {
        List<Integer> nombres = new ArrayList<>();

        nombres.add(4);
        nombres.add(3);
        nombres.add(5);
        nombres.add(10);

        nombres.stream()
            .map(val -> val * val)
            .forEach(System.out::println)
        ;
    }
}
