public class Test {
    public static void main(String[] args) {

        A a = new B();

        a.m1();
        a.m2();

        B b = new B();

        b.m2();
        b.m3();
    }
}