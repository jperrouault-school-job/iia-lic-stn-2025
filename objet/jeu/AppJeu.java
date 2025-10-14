package jeu;

import jeu.morpion.JeuMorpion;

public class AppJeu {
    public static void main(String[] args) {
        Jeu leJeu = new JeuMorpion();
        // Jeu leJeu = new JeuPuissance4();

        leJeu.demarrer();
    }
}
