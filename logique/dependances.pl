% Les faits
dependance(doctrine, symfony).
dependance(twig, symfony).

dependance('doctrine/dbal', doctrine).

dependance('php8.0', 'doctrine/dbal').

dependance('php8.0', twig).

% Les questions
% De quoi dépend directement symfony ?
?- dependance(X, symfony).

% Est-ce que quelque chose dépend de php8.0 ?
?- dependance('php8.0', X).
