package tests;

import base.A;
import base.B;

public class Exercice8 {
    public static void main(String[] args) {
        // Création des objets
        A a = new A();
        A ab = new B();  // Polymorphisme: variable de type A, mais objet de type B
        B b = new B();

        // Appels de la méthode f
        a.f(a);   // Appelle f(A o) dans A
        a.f(ab);  // Appelle f(A o) dans B (ab est de type B)
        a.f(b);   // Appelle f(A o) dans B (b est de type B)

        ab.f(a);  // Appelle f(A o) dans B (ab est de type B)
        ab.f(ab); // Appelle f(A o) dans B (ab est de type B)
        ab.f(b);  // Appelle f(A o) dans B (b est de type B)

        b.f(a);   // Appelle f(A o) dans B (b est de type B)
        b.f(ab);  // Appelle f(A o) dans B (ab est de type B)
        b.f(b);   // Appelle f(A o) dans B (b est de type B)
    }
}
