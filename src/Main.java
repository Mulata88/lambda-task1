public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divFixed.apply(a, b);

        calc.println.accept(c);

        int d = calc.divFixed.apply(5, -5);
        calc.println.accept(d);

        int e = calc.abs.apply(-500);
        calc.println.accept(e);

        int f = calc.multiply.apply(-500, 7);
        calc.println.accept(f);

        int g = calc.pow.apply(9);
        calc.println.accept(g);
    }
}
