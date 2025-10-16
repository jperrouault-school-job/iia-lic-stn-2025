public class App {
    public static void main(String[] args) {
        /*
            Créer une classe de base Voiture avec les attributs : marque, modèle, vitesseMax. Créer ensuite une sous-classe VoitureDeCourse qui hérite de Voiture et ajouter un attribut supplémentaire : turbo (booléen).
        */

        VoitureDeCourse renault5 = new VoitureDeCourse();

        renault5.setMarque("Renault");
        renault5.setModele("R5");
        renault5.setVitesseMax(119);
        renault5.setTurbo(true);
    }
}
