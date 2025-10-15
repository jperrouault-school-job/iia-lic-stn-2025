import java.util.ArrayList;
import java.util.List;

public class AppExo6 {
    public static void main(String[] args) {
        List<Integer> nombres = new ArrayList<>();

        nombres.add(4);
        nombres.add(13);
        nombres.add(15);
        nombres.add(10);

        int resultat = nombres.stream()
            .map(val -> val * 3)
            .filter(val -> val > 30)
            .reduce(0, (total, val) -> total + val)
        ;

        System.out.println(resultat);
    }
}
