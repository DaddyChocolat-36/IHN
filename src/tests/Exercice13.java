package tests;

class C {
    char ch = 'C';
    char getCh() {
        return ch;
    }
}

class D extends C {
    char ch = 'D';
    @Override
    char getCh() {
        return ch;
    }
}

public class Exercice13 {
    public static void main(String[] args) {
        C c = new C();
        C cd = new D();
        D d = new D();

        System.out.println(c.ch);        // 'C'
        System.out.println(c.getCh());   // 'C'
        System.out.println(cd.ch);       // 'C' (masquage de champ)
        System.out.println(cd.getCh());  // 'D' (polymorphisme)
        System.out.println(d.ch);        // 'D'
        System.out.println(d.getCh());   // 'D'
    }
}
