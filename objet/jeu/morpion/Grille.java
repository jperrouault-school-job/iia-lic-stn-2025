package jeu.morpion;

public class Grille {
    private char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    // Afficher le plateau
    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);

                if (j < 2) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i < 2){
                System.out.println("-----");
            }
        }
    }

    // Vérifier si le coup est valide
    // > Si la ligne saisie est >= 0
    // > Et si la ligne saisie est < 3
    // > Et si la colonne saisie est >= 0
    // > Et si la colonne saisie est < 3
    // > Et si la case est vide, qu'aucun autre joueur ne l'a déjà sélectionné
    private boolean isMoveValid(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Jouer un coup
    public boolean makeMove(char joueur, int row, int col) {
        // Si le coup est valide
        if (isMoveValid(row, col)) {
            board[row][col] = joueur; // On joue le coup en plaçant X ou O selon le joueur
            return true;
        }

        else {
            // Le coup n'est pas valide, mais on ne change pas de joueur pour autant !
            System.out.println("Coup invalide ! Redonner un autre coup.");

            return false;
        }
    }

    // Vérifier s'il y a un gagnant
    // > Quand la fonction tombe sur un "return", tout le reste de la fonction ne s'exécute pas, on retourne directement la valeur
    public char checkWinner() {
        // Vérification des lignes et colonnes
        for (int i = 0; i < 3; i++) {
            // Si toute la ligne a la même valeur, différente de case vide
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }

            // Si toute la colonne a la même valeur, différente de case vide
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        // Vérification des diagonales
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return ' '; // On n'a pas de gagnant
    }

    // Vérifier si la grille est pleine (match nul)
    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Si on trouve une seule case vide, c'est que la grille n'est pas pleine
                    // Ici, le return va arrêter la fonction, donc les boucles s'arrêtent
                }
            }
        }

        // En sortie de boucles, si on a pas trouvé de case vide, c'est que la grille est pleine !
        // > On arrive là seulement si aucune case n'est vide car si on a eu une case vide, on aurait faire le "return false"
        // > Au return, la fonction s'arrêtant, tout le reste ne s'exécute pas
        return true;
    }
}
