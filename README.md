Exercice n° 5

La réponse à cette question dépend de l'implémentation de la classe Dessin. Si la classe Dessin a été conçue pour fonctionner avec des objets de type Rectangle, alors elle peut potentiellement contenir des objets de type SlantedRectangle, car ceux-ci sont des sous-classes de Rectangle. Cependant, il faut vérifier si les méthodes surface, contains, et hull sont conçues pour gérer les cas spécifiques des rectangles inclinés.

• Méthode surface : Si cette méthode est basée sur des propriétés géométriques qui s'appliquent également aux rectangles inclinés, elle devrait fonctionner correctement.

• Méthode contains : Si cette méthode utilise des calculs basés sur les coordonnées des coins du rectangle, elle pourrait nécessiter une adaptation pour gérer les rectangles inclinés.

• Méthode hull : Cela dépend de l'implémentation spécifique. Si elle utilise des algorithmes qui prennent en compte uniquement les rectangles non inclinés, cela pourrait poser problème.

En résumé, la classe Dessin peut contenir des rectangles inclinés tant que les méthodes sont adaptées pour gérer ces cas spécifiques.
