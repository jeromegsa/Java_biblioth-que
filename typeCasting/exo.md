### Exercice 1 : Déclaration et taille des variables
**Objectif :** Pratiquer la déclaration de différentes variables et comprendre leurs tailles en mémoire.

- **Énoncé :** Déclarez des variables de différents types primitifs (`byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`) et affichez leurs tailles respectives en octets.

- **Indications :**
  - Utilisez la méthode `System.out.println()` pour afficher la taille des types primitifs.
  - Par exemple, pour obtenir la taille d'un type `int`, utilisez `System.out.println("Taille de int : " + Integer.BYTES + " octets");`.

### Exercice 2 : Concaténation et comparaison de chaînes de caractères
**Objectif :** Travailler avec la concaténation et les opérateurs de comparaison.

- **Énoncé :** Déclarez deux chaînes de caractères `str1` et `str2`. Concaténez-les pour obtenir une troisième chaîne `str3`. Comparez `str1` et `str2` à l'aide des opérateurs de comparaison (`==`, `equals()`) et affichez les résultats.

- **Indications :**
  - Utilisez l'opérateur `+` pour la concaténation.
  - Pour comparer les chaînes, utilisez à la fois `==` et `equals()`.
  - Affichez les résultats des comparaisons pour montrer la différence entre `==` et `equals()`.

### Exercice 3 : Opérateurs logiques et d'affectation
**Objectif :** Utiliser des opérateurs logiques et d'affectation dans des expressions conditionnelles.

- **Énoncé :** Déclarez trois variables entières `a`, `b`, et `c`. Utilisez les opérateurs d'affectation pour initialiser `b` et `c` avec des valeurs calculées à partir de `a`. Utilisez les opérateurs logiques pour créer une condition qui vérifie si `a` est supérieur à `b` ET `b` est inférieur à `c`. Affichez le résultat.

- **Indications :**
  - Utilisez des expressions comme `b = a + 2;` et `c = b * 2;`.
  - Utilisez l'opérateur `&&` pour l'opération logique.
  - Affichez un message comme "La condition est vraie" ou "La condition est fausse".

### Exercice 4 : Conversion de types (Widening et Narrowing)
**Objectif :** Mettre en pratique la conversion de types entre différentes tailles.

- **Énoncé :** Déclarez une variable entière `intVar` et affectez-lui une valeur. Effectuez une conversion widening pour convertir `intVar` en `double`, et une conversion narrowing pour convertir `doubleVar` en `short`. Affichez les résultats après chaque conversion.

- **Indications :**
  - Utilisez `doubleVar = intVar;` pour le widening.
  - Utilisez `shortVar = (short) doubleVar;` pour le narrowing.
  - Affichez les valeurs avant et après chaque conversion.

### Exercice 5 : Comparaison de valeurs et opérations combinées
**Objectif :** Combiner les notions d'opérateurs de comparaison, d'affectation et de logique.

- **Énoncé :** Déclarez deux variables `x` et `y` de types différents (`int` et `float`). Comparez-les après avoir effectué une conversion (widecasting ou narrowing) pour rendre leur comparaison possible. Utilisez un opérateur de comparaison pour vérifier si `x` est supérieur à `y` après conversion, et affichez le résultat.

- **Indications :**
  - Par exemple, effectuez une conversion de `x` en `float` pour le comparer à `y`.
  - Utilisez `>` pour comparer les valeurs et affichez "x est supérieur à y" ou "x n'est pas supérieur à y".
