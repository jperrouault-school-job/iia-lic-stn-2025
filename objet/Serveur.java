public class Serveur extends Equipement {
    private String[] services;

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    @Override
    public void demarrer() {
        System.out.println("Le serveur démarre ...");
    }

    public boolean arreter() {
        System.out.println("Le serveur arrête ...");
        return true;
    }
}
