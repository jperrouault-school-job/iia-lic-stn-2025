public class CompteBancaire {
    private String compte;

    // Si int ou long, considérez OK
    private double solde;

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getCompte() {
        return compte;
    }

    public void deposer(double valeur) {
        this.solde = this.solde + valeur;
    }

    public void retirer(double valeur) {
        this.solde = this.solde - valeur;
    }

    public void afficherSolde() {
        System.out.println("Le solde est de " + this.solde);
    }
}
