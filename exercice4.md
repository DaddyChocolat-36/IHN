p est une instance de Point.
r est une instance de Rectangle.
t est une référence de type Rectangle vers un objet SlantedRectangle.
s est une instance de SlantedRectangle.

# Appels de méthode :

1. System.out.println(r.surface());
Cela se compilera correctement.
À l'exécution, la méthode surface() de la classe Rectangle sera appelée.

2. r.rotate(2);
Cela se compilera correctement.
À l'exécution, la méthode rotate(int) de la classe Rectangle sera appelée.
System.out.println(r.contains(p));

3. System.out.println(r.contains(p));
Cela se compilera correctement.
À l'exécution, la méthode contains(Point) de la classe Rectangle sera appelée.
System.out.println(t.surface());

4. System.out.println(t.surface());
Cela se compilera correctement.
À l'exécution, la méthode surface() de la classe SlantedRectangle sera appelée car t est en réalité un objet SlantedRectangle.
t.rotate(2);

5. t.rotate(2);
Cela se compilera correctement.
À l'exécution, la méthode rotate(int) de la classe SlantedRectangle sera appelée car t est en réalité un objet SlantedRectangle.
System.out.println(t.contains(p));

6. System.out.println(t.contains(p));
Cela se compilera correctement.
À l'exécution, la méthode contains(Point) de la classe SlantedRectangle sera appelée car t est en réalité un objet SlantedRectangle.
System.out.println(s.surface());

7. System.out.println(t.contains(p));
Cela se compilera correctement.
À l'exécution, la méthode surface() de la classe SlantedRectangle sera appelée.
s.rotate(2);

8. s.rotate(2);
Cela se compilera correctement.
À l'exécution, la méthode rotate(int) de la classe SlantedRectangle sera appelée.
System.out.println(s.contains(p));

9. System.out.println(s.contains(p));
Cela se compilera correctement.
À l'exécution, la méthode contains(Point) de la classe SlantedRectangle sera appelée.