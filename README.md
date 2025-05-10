# Projet : Rectangles Inclinés en Java

Ce projet est une série d'exercices en Java illustrant les principes de l'héritage, du masquage de méthode et de la manipulation d'objets géométriques inclinés comme des rectangles non alignés avec les axes.

## Objectifs pédagogiques
- Comprendre et appliquer l'héritage en Java
- Manipuler des objets avec des rotations
- Étudier le comportement de l'exécution dynamique des méthodes
- Comparer redéfinition, surcharge et masquage de variables

## Structure du projet

```plaintext
src/
├── base/
│   ├── Point.java
│   ├── Rectangle.java
│   └── SlantedRectangle.java   <-- Hérite de Rectangle
├── outils/
│   └── Utilitaires.java
├── tests/
│   └── TestsRectangles.java    <-- Exercices 4 à 13
├── demo/
│   └── DemoMain.java
```

## Instructions GitHub
Chaque collaborateur doit :
1. Cloner le dépôt
2. Créer une branche nommée `exercice-nom` (ex: `exercice1-ali`)
3. Implémenter la classe ou méthode correspondant à l'exercice assigné
4. Commit et push avec un message clair : `Implémentation de l'exercice 1 - SlantedRectangle`
5. Ouvrir une Pull Request vers `main`

## Exercices

### Exercice 1 (Maïlang Nafissatou)
Créer une classe `SlantedRectangle` héritant de `Rectangle` et y ajouter un champ `angle`. Ajouter des constructeurs adaptés.

### Exercice 2 (Djoutsop Zanzi Michael Kevin)
Définir une méthode `rotate(double angle)` qui modifie l'angle d'inclinaison.

### Exercice 3 (Kenne Tchinda Odilon)
Lister les méthodes héritées de `Rectangle` et redéfinir celles qui sont inadaptées (ex: `toString`, `contains`, etc).

### Exercice 4 (Sousse-baa Djonma Joséphine)
Analyser le polymorphisme avec les déclarations et appels suivants dans un test `main`.

```java
Point p = new Point(1,2);
Rectangle r = new Rectangle(p, 2, 3);
Rectangle t = new SlantedRectangle(p, 2, 3);
SlantedRectangle s = new SlantedRectangle(p, 2, 3);
System.out.println(r.surface());
r.rotate(2);
System.out.println(r.contains(p));
System.out.println(t.surface());
t.rotate(2);
System.out.println(t.contains(p));
System.out.println(s.surface());
s.rotate(2);
System.out.println(s.contains(p));
```

### Exercice 5 (Hadjidjatou yasmine Ndairou)
Tester l'intégration de `SlantedRectangle` dans une classe `Dessin`.

### Exercice 6 (Maïramou Alh Nouhou)
Définir la méthode `toString()` dans `Rectangle` et décider si une redéfinition est utile dans `SlantedRectangle`.

### Exercice 7 (Ngatcha Tchakote Eddy Florian)
Redéfinir `equals()` dans `Rectangle` et `SlantedRectangle`.

### Exercice 8 à 11( Abdoul Rashid Ramadan (exercice 8); Djoutsop Zanzi Michael Kevin (exercice 9); Kenne Tchinda Odilon (exercice 10); Sousse-baa Djonma Joséphine (exercice 11))

Explorer le comportement des méthodes avec héritage, surcharge et masquage de paramètres dans les classes `A`, `B`, `C`, `D`.

### Exercice 12 (Matchoo Tagheu Ange Manuela)
Étudier les cas de `contains(Rectangle)` et `contains(SlantedRectangle)`. Identifier les cas non couverts.

### Exercice 13 (Matchoo Tagheu Ange Manuela)
Analyser les effets du masquage de variables et de la liaison dynamique avec :
```java
System.out.println(c.ch);
System.out.println(c.getCh());
System.out.println(cd.ch);
System.out.println(cd.getCh());
System.out.println(d.ch);
System.out.println(d.getCh());
```

## Compilation
Utiliser `javac` pour compiler manuellement ou configurer Gradle/Maven :

```bash
javac -d bin src/base/*.java src/incline/*.java src/demo/*.java
```

## Lancement
```bash
java -cp bin demo.DemoMain
```

Ce projet est développé dans le cadre d’un TP collaboratif sur la programmation orientée objet en Java.

---

Soumettez vos PR après avoir bien testé votre code et documenté chaque méthode !
