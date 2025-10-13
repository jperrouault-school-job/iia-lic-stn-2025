int[] monTab = { 5, 6, 10, 18, 5, 3, 7, -22, 6, -41 };

int somme = 0;

// somme = somme + monTab[0];
// somme = somme + monTab[1];
// somme = somme + monTab[2];
// somme = somme + monTab[3];
// ...
for (int i = 0; i < monTab.length; i = i +1) {
    somme = somme + monTab[i];
}

System.out.println(somme);

if (somme >= 50) {
    System.out.println("Sup. 50");
}
// if (somme < 50) {
else {
    System.out.println("Inf. 50");
}