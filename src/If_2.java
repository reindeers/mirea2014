/**
 * Created by m.vlasova on 19.02.2015.
 *
 Решение квадратного уравнения. Для уравнения ax2+bx+c=0 вывести либо 2 корня, либо 1, либо сообщение об отсутствии вещественных корней.
 */
import java.util.Arrays;

public class If_2 {
    public static void main(String[] args) {
       calcmethod(3, 5, 2);

    }

    private static void calcmethod(double a, double b, double c) {
        double  D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.println("Два корня:  " + ((Math.sqrt(D) - b) / 2 * a) +";  " + (-(Math.sqrt(D) - b) / 2 * a));
        } else if (D < 0) {
            System.out.println("Корней не найдено");
        } else {
               System.out.println("Один корень:   " + ((Math.sqrt(D) - b) / 2 * a));

        }

    }
}
