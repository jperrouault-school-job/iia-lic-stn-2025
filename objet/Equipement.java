// extends Object est implicite : tout est Object
// La classe sera abstraite, on ne pourra plus l'instancier
public abstract class Equipement {
    // Les attributs
    private int[] adresseIp = new int[4];
    private String localisation;
    private int[] ports;

    // Les getters et setters pour l'encapsulation

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


    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int[] getPorts() {
        return ports;
    }

    public void setPorts(int[] ports) {
        this.ports = ports;
    }

    // Les méthodes (les actions) qu'on peut faire avec un Routeur
    public void demarrer() {
        System.out.println("L'équipement démarre ...");
    }

    // Avec "abstract", je dis que la méthode existe
    // Mais je ne dis pas comment elle se réalise
    // Ce sera aux classes filles de l'implémenter
    public abstract boolean arreter();

}
