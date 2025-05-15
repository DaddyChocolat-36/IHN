package tests;

import base.A2;
import base.B2;

public class Exercice10 {

    public static void main(String[] args) {
        A2 a = new A2();
        A2 ab = new B2(); // `B2` est une sous-classe de `A2`
        B2 b = new B2();

        // Appels de la méthode `f` sur différentes instances
        a.f(a);   // Appelle f(A2 o) dans A2
        a.f(ab);  // Appelle f(B2 o) dans A2
        a.f(b);   // Appelle f(B2 o) dans A2

        ab.f(a);  // Appelle f(A2 o) dans B2
        ab.f(ab); // Appelle f(B2 o) dans B2
        ab.f(b);  // Appelle f(B2 o) dans B2

        b.f(a);   // Appelle f(A2 o) dans B2
        b.f(ab);  // Appelle f(B2 o) dans B2
        b.f(b);   // Appelle f(B2 o) dans B2
    }
}
