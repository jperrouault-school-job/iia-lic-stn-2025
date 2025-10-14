package jeu.morpion;

public class Joueur {
    // Pas de setPion, on dit que "pion" est en lecture seule
    private char pion;

    public char getPion() {
        return this.pion;
    }

    // Ici avec ce constructeur, on oblige le Joueur à avoir un pion !
    // On ne pourra pas instancier de Joueur avec new Joueur() sans argument
    // Dès qu'on défini un constructeur, le constructeur implicite par défaut n'existe plus !
    public Joueur(char pion) {
        this.pion = pion;
    }

    // "toString" est une méthode de la classe Object, qui est utilisée pour imprimer un Object sous forme de chaine de caractère
    // Souvent utilisé dans un System.out.println() par exemple, quand on veut imprimer l'objet
    @Override
    public String toString() {
        return "Joueur " + this.pion;
    }
}
