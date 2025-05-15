package base;

public class B1 extends A {
    // Surcharge de f(A) pour B1
    @Override
    public void f(A o) {
        System.out.println("void f(A o) dans B1");
    }

    // Surcharge de f(B) pour B1
    public void f(B o) {
        System.out.println("void f(B o) dans B1");
    }
}
