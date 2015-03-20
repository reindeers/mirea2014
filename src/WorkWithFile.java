import java.io.*;
/**
 * Created by sever on 15.03.2015.
 *
 * Написать метод, который принимает имя файла и читает все его строки. Для каждой строки в файле нужно выполнять различные действия:
 * просто посчитать количество строк, вывести строки на экран, возможны и другие действия.
 */
 
public class WorkWithFile {
    public static void getFile(String str, LineProcessor lf) {
        try {
            File f = new File(str);
            BufferedReader fin = new BufferedReader(new FileReader(f));
            String line = null;
            do {
                line = fin.readLine();
                if (line != null) {
                    lf.processLine(line);
                }

            }while (line != null);
        } catch (IOException e) { }
    }


    public static void main(String[] args) {

       OnlyCountLines whatToDo = new OnlyCountLines();
       getFile("C:\\Users\\m.vlasova\\Documents\\test.txt", whatToDo);
       System.out.println(whatToDo.getCount());

        ReadAllLines whatToDo2 = new ReadAllLines();
        getFile("C:\\Users\\m.vlasova\\Documents\\test.txt", whatToDo2);
        String[] rs = whatToDo2.getAllLines();
        for (int i = 0; i < rs.length; i++){
            System.out.println(rs[i]);
        }

    }
}
