% --- Faits ---

% Livres et auteurs
a_ecrit('Pierre Bottero', 'L\'Autre, Le souffle de la hyène').
a_ecrit('Pierre Bottero', 'L\'Autre, Le maître des tempètes').
a_ecrit('Pierre Bottero', 'L\'Autre, La huitième porte').

a_ecrit('J.K. Rowling', 'Harry Potter à l\'école des sorciers').
a_ecrit('J.K. Rowling', 'Harry Potter et la chambre des secrets').
a_ecrit('J.K. Rowling', 'Harry Potter et le prisonnier d\'Azkaban').

a_ecrit('J.R.R. Tolkien', 'Le Seigneur des Anneaux, Tome 1').
a_ecrit('J.R.R. Tolkien', 'Le Seigneur des Anneaux, Tome 2').
a_ecrit('J.R.R. Tolkien', 'Le Seigneur des Anneaux, Tome 3').

% Nationalités
nationalite('Pierre Bottero', francaise).
nationalite('J.K. Rowling', anglaise).
nationalite('J.R.R. Tolkien', anglaise).

% --- Règles ---
livre_francais(X) :- nationalite(Y, francaise) , a_ecrit(Y, X).
livre_anglais(X) :- nationalite(Y, anglaise) , a_ecrit(Y, X).
livre_nationalite(X, Z) :- nationalite(Y, Z) , a_ecrit(Y, X).


% --- Questions ---
% Qui a écrit Le seigneur des anneaux ?
?- a_ecrit(X, 'Le Seigneur des Anneaux, Tome 1').

% Qu'a écrit Pierre Bottero ?
?- a_ecrit('Pierre Bottero', X).

% Est-ce que Harry Potter a été écrit par J.K. Rowling ?
?- a_ecrit('J.K. Rowling', 'Harry Potter et la chambre des secrets')?

% Est-ce que L'Autre est français ?
?- livre_francais('L\'Autre, La huitième porte').
?- livre_nationalite('L\'Autre, La huitième porte', francaise).