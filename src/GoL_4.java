import java.util.Random;

/**
 * Created by sever on 22.02.2015.
 *
  Игра "Жизнь". Для отображения используйте класс Display и метод setMask:

  Display d = new Display();
  boolean[][] mask = ...;
  d.setMask(mask);

  */
public class GoL_4 {

    static final int N = 20;
    public static void main(String[] args) {

        boolean[][] mask = new boolean[N][N]; //{{true, true, true, true},{true, false, false, false},{true, true, false, true}, {true, false, false, true}};
        mask[3][1] = true;
        mask[3][2] = true;
        mask[3][3] = true;
        mask[2][3] = true;
        mask[1][2] = true;
//        Random rnd = new Random();
//        for (int i = 0; i < 20; i++) {
//            int x = rnd.nextInt(N);
//            int y = rnd.nextInt(N);
//            mask[x][y] = true;
//        }
        Display d = new Display();

        while (true){
            d.setMask(mask);
            boolean[][] newMask = new boolean[N][N];
            LifeGameSimple(mask, newMask); //ToDO: проверка /* Самая простая версия: простой перебор соседних клеток. */
            mask = newMask;
        }

    }

    private static void LifeGameSimple(boolean[][]mask, boolean[][]mask2){
        for (int i = 0; i < (mask.length); i++) {
            for (int j = 0; j < (mask.length); j++) {
                int count1 = countTrue(mask, i, j);
                if (mask[i][j]) {
                    if (count1 < 2) mask2[i][j] = false;
                    if ((count1 == 2) || (count1 == 3)) mask2[i][j] = true;
                    if (count1 > 3) mask2[i][j] = false;
                } else {
                    if (count1 == 3) mask2[i][j] = true;
                }

            }
        }
    }

    private static int countTrue(boolean[][]mask, int i, int j){
        int cnt = 0;
        int xM, xP;
        int yM, yP;

        if (i == 0) xM = N - 1; else xM = i - 1;
        if (i == N - 1) xP = 0; else xP = i + 1;
        if (j == 0) yM = N - 1; else yM = j - 1;
        if (j == N - 1) yP = 0; else yP = j + 1;

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
}
