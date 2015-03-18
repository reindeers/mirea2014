import java.util.Random;
import java.util.Scanner;
/**
 * Created by m.vlasova on 20.02.2015.
 *
 Реализовать игру "Угадай число". Компьютер загадывает случайное число, а человек пытается его отгадать. Для каждой попытки компьютер выдает, больше или меньше введенное число, чем загаданное.
 Если человек угадал, игра завершается. Используйте следующий код:
 int number = new Random().nextInt(100) + 1; // случайное число от 1 до 100
 Scanner in = new Scanner(System.in);
 int guess = in.nextInt(); // число, прочитанное с клавиатуры
 */
public class LoopGame_3 {

    static int flag = 0;

    public static void main(String[] args) {
        int number = new Random().nextInt(100) + 1; // случайное число от 1 до 100
            while (!checkNumber(number));
    }
    private static boolean checkNumber(int number){
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt(); // число, прочитанное с клавиатуры
        if (guess < number) {
            System.out.print("Загаданное число больше");
            return false;
        } else if (guess > number) {
            System.out.print("Загаданное число меньше");
            return false;
        } else{
            System.out.print("Угаданно!");
            return true;
        }
    }

}
