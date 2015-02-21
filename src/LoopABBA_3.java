/**
 * Created by m.vlasova on 19.02.2015.
 *
 Для целых чисел от 1 до 100 вывести: если число делится на 5 и на 7, вывести строку "ABBA";
                                      если число делится на 5, вывести строку "A";
                                      если число делится на 7, вывести строку "B";
                                      иначе вывести само число.

 */
public class LoopABBA_3 {
    public static void main(String[] args) {
            printmethod();
    }

    private static void printmethod(){
        for (int i = 1; i <= 100; i++){
            if  ((Math.round(i % 5) == (i % 5)) & Math.round(i % 7) == (i % 7)){
                System.out.println("ABBA");
            } else if (Math.round(i % 5) == (i % 5)){
                System.out.println("A");
            } else if (Math.round(i % 7) == (i % 7)){
                System.out.println("B");
            } else {
                System.out.print(i);
            }
        }
    }
}
