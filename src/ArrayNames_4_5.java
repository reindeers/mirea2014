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

        boolean[][] mask = {{true, true, true, true},{true, false, false, false},{true, true, false, true}, {true, false, false, true}};
        boolean[][] mask2 = new boolean[4][4];
        LifeGame(mask, mask2); //ToDO: цикл
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

  /*

  Игра "Жизнь". Для отображения используйте класс Display и метод setMask:

  Display d = new Display();
  boolean[][] mask = ...;
  d.setMask(mask);

  */

    private static void LifeGame(boolean[][]mask, boolean[][]mask2){
       // Display d = new Display();

       // d.setMask(mask);
        int xM, xP;
        int yM, yP;


        for (int i = 0; i < (mask.length); i++) {
            if (i == 0) xM = 3; else xM = i - 1;
            if (i == 3) xP = 0; else xP = i + 1;

            for (int j = 0; j < (mask.length); j++) {
                if (j == 0) yM = 3; else yM = j - 1;
                if (j == 3) yP = 0; else yP = j + 1;
                int count1 = 0;
                    if (mask[i][j]) {

                        if (mask[i][yP]) count1++;
                        if (mask[i][yM]) count1++;
                        if (mask[xP][j]) count1++;
                        if (mask[xM][j]) count1++;
                        if (mask[xP][yP]) count1++;
                        if (mask[xP][yM]) count1++;
                        if (mask[xM][yM]) count1++;
                        if (mask[xM][yP]) count1++;

                        if (count1 < 2) mask2[i][j] = false; //ToDo: сделать case, вынести отдельной функцией, отрисовывать
                        if ((count1 == 2) || (count1 == 3)) mask2[i][j] = true;
                        if (count1 > 3) mask2[i][j] = false;

                    } else if (!mask[i][j]) {
                        if (mask[i][yP]) count1++;
                        if (mask[i][yM]) count1++;
                        if (mask[xP][j]) count1++;
                        if (mask[xM][j]) count1++;
                        if (mask[xP][yP]) count1++;
                        if (mask[xP][yM]) count1++;
                        if (mask[xM][yM]) count1++;
                        if (mask[xM][yP]) count1++;
                        if (count1 == 3) mask2[i][j] = true;
                    }
                }
            }
        }
     //   d.setMask(mask);


}
