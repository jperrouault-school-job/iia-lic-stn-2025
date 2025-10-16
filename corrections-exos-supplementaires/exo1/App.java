public class App {
    public static void main(String[] args) {
        /*
            Créer une classe Personne avec les attributs suivants : nom, âge, et genre.
            Ajouter des méthodes pour obtenir et définir ces attributs (getters et setters).
            Créer ensuite une méthode afficherInfos() qui affiche les informations de la personne.
        */

        Personne personne = new Personne();

        personne.setNom("Jérémy");
        personne.setAge(28);
        personne.setGenre(0);

        personne.afficherInfos();
    }
}
