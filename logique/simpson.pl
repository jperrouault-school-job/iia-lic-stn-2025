% Les faits, ce qui est vrai

maman(marge, bart).
maman(marge, lisa).
maman(marge, maggie).

maman(jacqueline, marge).
maman(mona, homer).

papa(homer, bart).
papa(homer, lisa).
papa(homer, maggie).

papa(abraham, homer).
papa(clancy, marge).

% Les règles
% Pour être parent, il faut être maman OU papa
parent(X, Y) :- maman(X, Y) ; papa(X, Y).

% Pour être grand-parent, il faut être parent du parent
% X est parent de Y, Y est parent de Z, donc X est grandparent de Z
grandparent(X, Z) :- parent(X, Y) , parent(Y, Z).

%  Les questions
% Qui est parent de marge ?
?- parent(X, marge).

% Est-ce que mona est grand parent de bart ?
?- grandparent(mona, bart).

% Est-ce que mona est grand parent de marge ?
?- grandparent(mona, marge).

% Qui est grand parent de bart ?
?- grandparent(X, bart).
