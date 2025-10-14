import java.util.ArrayList;
import java.util.List;

public class AppHeritage {
    public static void main(String[] args) {
        Routeur routeur1 = new Routeur();
        Equipement routeur2 = new Routeur();
        // Routeur routeur3 = new Equipement(); PAS POSSIBLE
        Object routeur3 = new Routeur();
        Equipement serveur1 = new Serveur();

        // Equipement[] equipements = new Equipement[2];
        List<Equipement> equipements = new ArrayList<>();

        // equipements[0] = routeur1;
        // equipements[1] = serveur1;
        // equipements[2] = routeur2;
        equipements.add(routeur1);
        equipements.add(serveur1);
        equipements.add(routeur2);

        for (int i = 0; i < equipements.size(); i = i + 1) {
            equipements.get(i).demarrer();
        }

        // foreach
        for (Equipement equipement : equipements) {
            equipement.demarrer();
        }

        // routeur1.demarrer();
        // routeur2.demarrer();
        // serveur1.demarrer();
        // routeur3.demarrer(); PAS POSSIBLE CAR OBJECT N'A PAS demarrer()

        // Equipement equipement = new Equipement(); // PAS POSSIBLE CAR LA CLASSE EST ABSTRACT
    }
}
