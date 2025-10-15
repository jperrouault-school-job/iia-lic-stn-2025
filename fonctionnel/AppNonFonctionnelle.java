public class AppNonFonctionnelle {
    public static void main(String[] args) {
        Maths math = new Maths();

        operation(math, true, 5, 3);
    }

    static void operation(Maths math, boolean faireAddition, int a, int b) {
        int resultat = 0;

        if (faireAddition == false) {
            resultat = math.soustraire(a, b);
        }

        else {
            resultat = math.additionner(a, b);
        }

        System.out.println(resultat);
    }
}
