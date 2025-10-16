% La syntaxe générale :

% On donne un "predicate" avec éventuellement des arguments
% On termine la description par un point "."

predicate(arg1, arg2, ..., argN).

% On y défini les faits ...
% > Jeremy est un homme
homme(jeremy).

% > Marie et Natasha sont des femmes
femme(natasha).
femme(marie).

% > Jeremy est le père de Marie
pere(jeremy, marie).

% > Natasha est la mère de Marie
mere(natasha, marie).


% ... Et on y défini les règles ...
% > ":-" veut dire SI
% > "," veut dire ET
% > ";" veut dire OU
% > Ici on dit que si X est le père de Y OU que X est la mère de Y, alors X est le parent de Y
parent(X, Y) :- pere(X, Y) ; mere(X, Y).




% Pour enfin pauser une question, un but
% > "?-" veut dire "est-ce que ?"
% > Ici on demande si jeremy est un parent de marie
?- parent(jeremy, marie).

% > Ici on demande qui est parent de marie
?- parent(X, marie).
