public class Personne {
    private String nom;
    private int age;
    private int genre; // 0 = homme, 1 = femme (on pourrait utiliser un boolean aussi, mais c'est plus restrictif par les temps qui courrent)

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public void afficherInfos() {
        System.out.println("Personne [nom=" + nom + ", age=" + age + ", genre=" + genre + "]");
    }
}
