import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres = new ArrayList<>();

    public void ajouter(Livre livre) {
        livres.add(livre);
    }

    public void afficher() {
        for (Livre livre : livres) {
            System.out.println(livre.getTitre() + ", de " + livre.getAuteur());
        }
    }
}
