/**
 * Created by m.vlasova on 19.02.2015.
 *
 *
 Заполните массив String[] names именами и создайте массив String[] greetings с приветствиями.
 Например, если names = {"Иван", "Петр"}, то greetings = {"Привет, Иван", "Привет, Петр"}.

 +

 Оформите задания 4.1, 4.2 в виде методов:

 public static String[] greet(String[] names)
 public static int[] concat(int[] x, int[] y)


 */


public class ArrayNames_4_5 {
    public static void main(String[] args) {
        String[] names = {"Иван", "Петр"};

        String[] resGreet = greet(names);
        for (int i = 0; i <  resGreet.length; i++){
            System.out.println(resGreet[i]);
        }

        int[] x = {2, 3, 4};
        int[] y = {7, 6};
        int[] resConcat = concat(x, y);

        for (int i = 0; i <  resConcat.length; i++){
            System.out.print(resConcat[i]);
        }

    }

    private static String[]  greet(String[] names){

        String[] greetings = new String[names.length];

        for (int i = 0; i < names.length; i++){
            greetings[i] =   "Привет, " + names[i];
        }

        return greetings;
    }

/*

 Создайте два массива int[] x и int[] y и создайте третий массив int[] z так, чтобы его длина была равна сумме длин x и y и z был получен "склеиванием" x и y.
 Напрмер, если x = {2, 3, 4}, y = {7, 6}, то z = {2, 3, 4, 7, 6}.

 */
    private static int[] concat(int[] x, int[] y){
        int[] z = new int[x.length + y.length];
        int counter = 0;
        for (int i = 0; i < x.length; i++){
           z[i] = x[i];
            counter = i;
        }
        counter++;

        for (int i = 0; i < y.length; i++){
            z[i+counter] = y[i];
        }

        return z;
    }
}
