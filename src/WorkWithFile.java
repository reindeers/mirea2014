import java.io.*;

/**
 * Created by sever on 15.03.2015.
 *
 * Написать метод, который принимает имя файла и читает все его строки. Для каждой строки в файле нужно выполнять различные действия:
 * просто посчитать количество строк, вывести строки на экран, возможны и другие действия.
 */
public class WorkWithFile {

    public static void getFile(String str) {
        try {
            File f = new File(str);
            BufferedReader fin = new BufferedReader(new FileReader(f));

            int cnt = 0;
            while ((fin.readLine()) != null) cnt++;

            fin = new BufferedReader(new FileReader(f)); //тип чтобы снова стоять в начале файла. Выглядит, как костыль.

            String[] lines = new String[cnt];
            for (int i = 0; i < cnt; i++){
                lines[i] = fin.readLine();
            }

            FileT ft = new FileT(lines, cnt);
            System.out.println(ft.getCount());

        } catch (IOException e) {
            //
        }
    }

    public static void main(String[] args) {
        getFile("D:\\test.txt");

    }
}
