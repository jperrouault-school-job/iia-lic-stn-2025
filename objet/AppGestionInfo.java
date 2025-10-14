public class AppGestionInfo {
    // main / psvm
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Créer un routeur pour le manipuler
        // "new" permet de fabriquer notre Routeur, de le construire
        // On utilise les parenthèses car la construction est une fonction
        // > "constructeur"
        Routeur routeur1 = new Routeur();
        Routeur routeur2 = new Routeur();

        // routeur1.localisation = "Le bureau";
        // routeur2.localisation = "La maison";
        routeur1.setLocalisation("Le bureau");
        routeur2.setLocalisation("La maison");

        // "routeur1", c'est un Routeur qu'on peut manipuler : il existe!
        // "routeur1" c'est une variable qui fait référence à un Routeur
        // "routeur1" fait référence à une instance de classe => un objet !
        routeur1.demarrer();

        System.out.println("Le routeur 1 est : " + routeur1.getLocalisation().toUpperCase());

        // routeur1.adresseIp[0] = 192;
        // routeur1.adresseIp[1] = 168;
        // routeur1.adresseIp[2] = 1;
        // routeur1.adresseIp[3] = 500;

        routeur1.setAdresseIp(192, 168, 0, 10);

        System.out.println("Le routeur 1 a l'adresse IP " + routeur1.getAdresseIp());

    }
}
