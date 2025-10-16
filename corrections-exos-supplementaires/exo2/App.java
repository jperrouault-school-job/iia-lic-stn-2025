public class App {
    public static void main(String[] args) {
        /*
            Créer une classe CompteBancaire avec les attributs suivants : numéro de compte, solde. Ajouter des méthodes pour déposer de l'argent, retirer de l'argent et afficher le solde.
        */

        CompteBancaire compteBancaire = new CompteBancaire();


        compteBancaire.deposer(10_000);
        compteBancaire.deposer(1_000.50);
        compteBancaire.retirer(5000.49);

        compteBancaire.afficherSolde();
    }
}
