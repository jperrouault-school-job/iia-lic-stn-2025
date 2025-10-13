// Exo #1
// Fonction "additionner" qui attend 3 paramètres, les additionne et retourne le résultat de cette addition
// L'exécuter et afficher le résultat
int addition(int a, int b, int c) {
    int resultat = a + b + c;
    return resultat;
}

int resultat = addition(5, 8, 13);
System.out.println(resultat);

System.out.println(addition(5, 8, 13));



// Exo #2
// Fonction "somme" qui attend un tableau d'entiers, en fait la somme et retourne le résultat
// L'exécuter et afficher le résultat
int[] monTab = { 5, 6, 10, 18, 5, 3, 7, -22, 6, -41 };

int somme(int[] tab) {
    int somme = 0;

    for (int i = 0; i < tab.length; i = i +1) {
        somme = somme + tab[i];
    }

    return somme; // On retourne le résultat de la somme
}

int resultat = somme(monTab);
System.out.println(resultat);



// Exo #3
// Fonction "afficher" qui attend un tableau d'entiers, et les affiche sur une seule ligne
int[] monTab = { 5, 6, 10, 18, 5, 3, 7, -22, 6, -41 };

void afficher(int[] tab) {
    for (int i = 0; i < tab.length; i = i + 1) {
        System.out.print(tab[i] + ", ");
    }
}

afficher(monTab);