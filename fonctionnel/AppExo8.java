import java.util.ArrayList;
import java.util.List;

public class AppExo8 {
    public static void main(String[] args) {
        List<Integer> nombres = new ArrayList<>();

        nombres.add(4);
        nombres.add(13);
        nombres.add(15);
        nombres.add(90);

        // Solution #1
        int resultat = nombres.stream()
            .reduce(Integer.MAX_VALUE, (min, val) -> {
                if (min < val) {
                    return min;
                }

                return val;
            })
        ;

        // Solution #2
        int resultat2 = nombres.stream()
            .reduce(Integer.MAX_VALUE, Integer::min)
        ;

        // Solution #3
        int resultat3 = nombres.stream()
            .reduce(Integer::min)
            .get()
        ;

        // Solution #4
        int resultat4 = nombres.stream()
            .sorted()
            .findFirst()
            .get()
        ;

        // Solution #5
        int resultat5 = nombres.stream()
            .mapToInt(Integer::valueOf)
            .min()
            .getAsInt()
        ;

        System.out.println(resultat);
        System.out.println(resultat2);
    }
}
