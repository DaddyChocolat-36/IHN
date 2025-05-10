package base;

public class B2 extends A2 {
    @Override
    public void f(A2 o) {
        System.out.println("void f(A2 o) dans B2");
    }

    @Override
    public void f(B2 o) {
        System.out.println("void f(B2 o) dans B2");
    }
}
