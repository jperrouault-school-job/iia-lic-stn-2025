package fr.formation;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Réagir à l'ajout d'un nouveau livre dans la bibliothèque : Afficher "Le livre de Auteur, Titre, de X pages est arrivé en bibliothèque !". Pour simuler ces ajouts, ajouter avec une pause entre chaque quelques livres.
        */

        Bibliotheque biblio = new Bibliotheque();


        biblio.getLivres().subscribe(livre -> System.out.println("Le livre de " + livre.getAuteur() + ", " + livre.getTitre() + ", de " + livre.getNbPages() + " pages est arrivé en bibliothèque !"));


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

        Thread.sleep(1_000);
        biblio.ajouter(hp2);

        Thread.sleep(3_000);
        biblio.ajouter(hp3);

        Thread.sleep(500);
        biblio.ajouter(hp4);

        Thread.sleep(4_000);
        biblio.ajouter(hp5);

        Thread.sleep(1_000);
        biblio.ajouter(hp6);

        Thread.sleep(500);
        biblio.ajouter(hp7);

        Thread.sleep(500);
        biblio.ajouter(la1);

        Thread.sleep(1_500);
        biblio.ajouter(la2);

        Thread.sleep(2_000);
        biblio.ajouter(la3);
    }
}
