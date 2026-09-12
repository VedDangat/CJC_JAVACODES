public class Calculator {

    public void Addition() {
        int a = 20;
        int b = 30;
        int sum;

        sum = a + b;

        System.out.println("addition = " + sum);
    }

    public void Addition(int a, int b) {
        System.out.println("sum / addition = " + (a + b));
    }

    public void Addition(int a, int b, int c) {
        System.out.println("triple addition = " + (a + b + c));
    }

    public void Addition(float a, float b) {
        System.out.println("float addition = " + (a + b));
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.Addition();
        c.Addition(100, 200);
        c.Addition(100, 200, 300);
        c.Addition(12f, 13f);
    }
}

