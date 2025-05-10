// Classe B (hérite de A)
package base;

public class B extends A {
    // Redéfinir la méthode et la rendre publique
    @Override
    public void f(A o) {
        System.out.println("void f(A o) dans B");
    }
}
