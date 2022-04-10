import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

//    BinaryOperator<Integer> divide = (x, y) -> x / y;
//    проблема при делении на "0", решим при помощи тернарного оператора
    BinaryOperator<Integer> divFixed = (x, y) -> y == 0 ? 0 : x / y;

    UnaryOperator<Integer> pow = x -> (int)Math.pow(x, 2);
    UnaryOperator<Integer> abs = Math::abs;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
