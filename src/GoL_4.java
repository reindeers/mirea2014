/**
 * Created by sever on 22.02.2015.
 */

  /*

  Игра "Жизнь". Для отображения используйте класс Display и метод setMask:

  Display d = new Display();
  boolean[][] mask = ...;
  d.setMask(mask);

  */
public class GoL_4 {
    public static void main(String[] args) {

        boolean[][] mask2 = {{true, true, true, true},{true, false, false, false},{true, true, false, true}, {true, false, false, true}};
        boolean[][] mask = new boolean[4][4];
        while (1==1){
            System.arraycopy(mask2, 0, mask, 0, mask2.length);
            LifeGameSimple(mask, mask2); //ToDO: проверка
        }

    }

    private static void LifeGameSimple(boolean[][]mask, boolean[][]mask2){
        // Display d = new Display();
        // d.setMask(mask);
        int count1 = 0;
        for (int i = 0; i < (mask.length); i++) {
            for (int j = 0; j < (mask.length); j++) {

                if (mask[i][j]) {
                    count1 = countTrue(mask, i, j);
                    if (count1 < 2) mask2[i][j] = false; //ToDo: отрисовывать
                    if ((count1 == 2) || (count1 == 3)) mask2[i][j] = true;
                    if (count1 > 3) mask2[i][j] = false;
                } else if (!mask[i][j]) {
                    count1 = countTrue(mask, i, j);
                    if (count1 == 3) mask2[i][j] = true;
                }

            }
        }
    }

    private static int countTrue(boolean[][]mask, int i, int j){
        int cnt = 0;
        int xM, xP;
        int yM, yP;

        if (i == 0) xM = 3; else xM = i - 1;
        if (i == 3) xP = 0; else xP = i + 1;
        if (j == 0) yM = 3; else yM = j - 1;
        if (j == 3) yP = 0; else yP = j + 1;

        if (mask[i][yP]) cnt++;
        if (mask[i][yM]) cnt++;
        if (mask[xP][j]) cnt++;
        if (mask[xM][j]) cnt++;
        if (mask[xP][yP]) cnt++;
        if (mask[xP][yM]) cnt++;
        if (mask[xM][yM]) cnt++;
        if (mask[xM][yP]) cnt++;

        return cnt;
    }
    //   d.setMask(mask);

}
