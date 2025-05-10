public class exercice11 {
    public static void main(String[] args) {
        class A {}
        class B extends A {}

        A a = new A();
        A ab = new B();
        B b = new B();

        System.out.println(a instanceof A);  // true
        System.out.println(ab instanceof A); // true
        System.out.println(b instanceof A);  // true
        System.out.println(a instanceof B);  // false
        System.out.println(ab instanceof B); // true
        System.out.println(b instanceof B);  // true
    }
}
