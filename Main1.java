public class Main1 {
    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        B b = new B();

        a.f(a);    // A.f(A)
        a.f(ab);   // A.f(A)
        a.f(b);    // A.f(A)
        ab.f(a);   // B.f(A)
        ab.f(ab);  // B.f(A)
        ab.f(b);   // B.f(A)
        b.f(a);    // B.f(A)
        b.f(ab);   // B.f(A)
        b.f(b);    // B.f(B)
    }
}

class A {
    void f(A a) {
        System.out.println("A.f(A)");
    }
}

class B extends A {
    @Override
    void f(A a) {
        System.out.println("B.f(A)");
    }

    // Surcharge de la méthode f
    void f(B b) {
        System.out.println("void f(B o) dans B");
    }
}

