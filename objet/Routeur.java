public class Routeur extends Equipement {
    // Polymorphisme d'héritage
    @Override
    public void demarrer() {
        System.out.println("Le routeur démarre ...");
    }

    @Override
    public boolean arreter() {
        System.out.println("Le routeur est arrêté ...");
        return true;
    }
}
