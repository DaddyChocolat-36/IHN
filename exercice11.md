# Exercice n° 11
Qu'affiche le fragment de programme suivant ?
 System.out.println(a instanceof A);
 System.out.println(ab instanceof A);
 System.out.println(b instanceof A);
 System.out.println(a instanceof B);
 System.out.println(ab instanceof B);
 System.out.println(b instanceof B);


1. System.out.println(a instanceof A);
true – a est une instance directe de A.

2. System.out.println(ab instanceof A);
true – ab est une instance de B, qui hérite de A.

3. System.out.println(b instanceof A);
true – b est une instance de B, qui hérite de A.

4. System.out.println(a instanceof B);
false – a est une instance de A, pas de B.

5. System.out.println(ab instanceof B);
true – ab fait référence à une instance de B.

6. System.out.println(b instanceof B);
true – b est une instance directe de B.