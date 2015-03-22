
/**
 * Created by sever on 22.03.2015.
 */

public class TestForIterator {
    public static void main(String[] args) {
        NaturalNumber it = new NaturalNumber();
        System.out.println("Натуральные числа:");
        for (int i = 0; i < 10; i++){
            System.out.println(it.next());
        }

        FibonacciNumber fn = new FibonacciNumber();
        System.out.println("Числа Фибоначчи:");
        for (int i = 0; i < 10; i++){
            System.out.println(fn.next());
        }


        System.out.println("Цикл for-each:");
        int stop = 100;
        int cnt = 0;
        for (NaturalNumber i = new NaturalNumber(); i.hasNext(); ){
            System.out.println(i.next());
            cnt++;
            if (cnt==stop) break;

        }

    }
}
