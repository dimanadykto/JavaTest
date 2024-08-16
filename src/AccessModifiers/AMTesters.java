package AccessModifiers;

import AccessModifiers.A;
import AccessModifiers.B;

public class AMTesters extends A {
    public static void main(String[] args) {
        System.out.println(a);
        B obj1 = new B();
        System.out.println(obj1.b);
    }
}
