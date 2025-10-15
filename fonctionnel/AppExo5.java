import java.util.ArrayList;
import java.util.List;

public class AppExo5 {
    public static void main(String[] args) {
        List<Integer> nombres = new ArrayList<>();

        nombres.add(4);
        nombres.add(3);
        nombres.add(5);
        nombres.add(10);

        nombres.stream()
            .map(val -> val * val)
            .filter(val -> val > 25 )
            .forEach(System.out::println)
        ;

        System.out.println("-----");

        nombres.forEach(System.out::println);
    }
}
