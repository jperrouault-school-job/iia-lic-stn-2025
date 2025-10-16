package fr.formation;

// La programmation réactive permet de réagir directement après un évènement

// En programmation orientée objet, on y décrit des objets réels, qui contiennent des données
// En programmation fonctionnelle, on y décrit des transformations de données
// En programmation réactive, on y décrit les réactions aux changements de données au fil du temps

// Jusqu'à maintenant, le développement était synchrone : une méthode appelée était exécutée, on attendait la fin de son exécution et on passait à la suite
// Avec la réactivité, le développement est asynchrone : une méthode peut être appelée à n'importe quel moment (au moment du changement de la donnée) et être jouée en concurrence d'une autre (autre Thread souvent)

public class AppExemple {
    // On ajoute "throws Exception" pour ne pas gérer les éventuelles Exceptions qui pourraient survenir
    // > Ce serait notamment le cas dans la manipulation des Threads
    public static void main(String[] args) throws Exception {
        // Le code viendra ici comme d'habitude
    }
}
