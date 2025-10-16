public class App {
    public static void main(String[] args) {
        /*
            Créer une classe Livre avec des attributs comme titre, auteur, nombre de pages. Ensuite, créer une classe Bibliotheque qui gère des livres. Ajouter des méthodes pour ajouter un livre et afficher tous les livres.
        */

        Bibliotheque biblio = new Bibliotheque();
        Livre hp1 = new Livre();
        Livre hp2 = new Livre();
        Livre hp3 = new Livre();
        Livre hp4 = new Livre();
        Livre hp5 = new Livre();
        Livre hp6 = new Livre();
        Livre hp7 = new Livre();
        Livre la1 = new Livre();
        Livre la2 = new Livre();
        Livre la3 = new Livre();

        hp1.setAuteur("J.K. Rowling");
        hp1.setTitre("Harry Potter à l'école des Sorciers");
        hp1.setNbPages(311);

        hp2.setAuteur("J.K. Rowling");
        hp2.setTitre("Harry Potter et la Chambre des Secrets");
        hp2.setNbPages(460);

        hp3.setAuteur("J.K. Rowling");
        hp3.setTitre("Harry Potter et le Prisonnier d'Azkaban");
        hp3.setNbPages(448);

        hp4.setAuteur("J.K. Rowling");
        hp4.setTitre("Harry Potter et la Coupe de Feu");
        hp4.setNbPages(768);

        hp5.setAuteur("J.K. Rowling");
        hp5.setTitre("Harry Potter et l'Ordre des Phoenix");
        hp5.setNbPages(1031);

        hp6.setAuteur("J.K. Rowling");
        hp6.setTitre("Harry Potter et le Prince de sang-mêlé");
        hp6.setNbPages(720);

        hp7.setAuteur("J.K. Rowling");
        hp7.setTitre("Harry Potter et les Reliques de la Mort");
        hp7.setNbPages(850);

        la1.setAuteur("Pierre Bottero");
        la1.setTitre("L'autre : Le souffle de la hyène");
        la1.setNbPages(307);

        la2.setAuteur("Pierre Bottero");
        la2.setTitre("L'autre : Le Maître des tempêtes");
        la2.setNbPages(360);

        la3.setAuteur("Pierre Bottero");
        la3.setTitre("L'autre : La huitième porte");
        la3.setNbPages(384);

        biblio.ajouter(hp1);
        biblio.ajouter(hp2);
        biblio.ajouter(hp3);
        biblio.ajouter(hp4);
        biblio.ajouter(hp5);
        biblio.ajouter(hp6);
        biblio.ajouter(hp7);
        biblio.ajouter(la1);
        biblio.ajouter(la2);
        biblio.ajouter(la3);

        biblio.afficher();
    }
}
