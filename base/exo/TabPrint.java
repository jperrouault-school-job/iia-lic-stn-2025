// Solution #1

System.out.println("1 2 3");
System.out.println("4 5 6");
System.out.println("7 8 9");

// Solution #2
for (int i = 1; i < 10; i = i + 1) {
    System.out.print(i);
    System.out.print(" ");

    if (i == 3 || i == 6) {
        System.out.println();
    }
}

// Solution #3
for (int i = 1; i < 10; i = i + 1) {
    System.out.print(i + " ");

    // Modulo 3 -> Si le reste de la division par 3 est rien
    if (i % 3 == 0) {
        System.out.println();
    }
}

// Solution #4
int[][] monTab = {
    { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 }
};

for (int i = 0; i < monTab.length; i = i + 1) {
    for (int j = 0; j < monTab[i].length; j = j + 1) {
        System.out.print(monTab[i][j] + " ");
    }

    System.out.println();
}