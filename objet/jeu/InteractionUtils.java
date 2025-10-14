package jeu;

public class InteractionUtils {
    // Le "static" permet d'utiliser la méthode "readInt" sans à avoir besoin d'instancier la classe (voir lignes 29 et 30 de JeuMorpion)
    public static int readInt() {
        return Integer.parseInt(System.console().readLine());
    }
}
