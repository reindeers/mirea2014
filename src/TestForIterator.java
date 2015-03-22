/**
 * Created by sever on 22.03.2015.
 */

public class TestForIterator {
    public static void main(String[] args) {
        NaturalNumber it = new NaturalNumber();
        System.out.println("Натуральные числа:");
        for (int i = 0; i < 10000; i++){
            System.out.println(it.next());
        }

        FibonacciNumber fn = new FibonacciNumber();
        System.out.println("Числа Фибоначчи:");
        for (int i = 0; i < 10; i++){
            System.out.println(fn.next());
        }
    }
}
