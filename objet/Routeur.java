public class Routeur {
    // Les attributs qui décrivent un Routeur
    private int[] adresseIp = new int[4];
    int[] ports;
    private String localisation;

    // Setter pour adresseIp
    public void setAdresseIp(int p1, int p2, int p3, int p4) {
        if (p1 <= 255 && p1 >= 0) {
            adresseIp[0] = p1;
        }

        if (p2 <= 255 && p2 >= 0) {
            adresseIp[1] = p2;
        }

        if (p3 <= 255 && p3 >= 0) {
            adresseIp[2] = p3;
        }

        if (p4 <= 255 && p4 >= 0) {
            adresseIp[3] = p4;
        }
    }

    // Getter adresse IP
    public String getAdresseIp() {
        return adresseIp[0] + "." + adresseIp[1] + "." + adresseIp[2] + "." + adresseIp[3];
    }

    public void setLocalisation(String localisation) {
        // "this" permet de faire référence à l'objet, et donc à l'attribut "locasation" de l'objet
        this.localisation = localisation;
    }

    public String getLocalisation() {
        return localisation;
    }

    // Les méthodes (les actions) qu'on peut faire avec un Routeur
    void demarrer() {
        // sout / sysout
        System.out.println("Le routeur démarre à : " + localisation);
    }

    boolean arreter() {
        System.out.println("Le routeur s'arrête ...");
        return true;
    }

    // TODO : lier()
}
