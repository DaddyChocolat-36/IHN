package tests;

import base.A;
import base.B1;

public class Exercice9 {

    public static void main(String[] args) {
        A a = new A();
        A ab = new B1();
        B1 b = new B1();

        // Appels de la méthode f() selon le type d'objet
        a.f(a);   // Appelle f(A o) dans A
        a.f(ab);  // Appelle f(A o) dans B1
        a.f(b);   // Appelle f(A o) dans B1

        ab.f(a);  // Appelle f(A o) dans B1
        ab.f(ab); // Appelle f(A o) dans B1
        ab.f(b);  // Appelle f(B o) dans B1

        b.f(a);   // Appelle f(A o) dans B1
        b.f(ab);  // Appelle f(A o) dans B1
        b.f(b);   // Appelle f(B o) dans B1
    }
}
