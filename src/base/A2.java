package base;

public class A2 {
    public void f(A2 o) {
        System.out.println("void f(A2 o) dans A2");
    }

    public void f(B2 o) {
        System.out.println("void f(B2 o) dans A2");
    }
}
