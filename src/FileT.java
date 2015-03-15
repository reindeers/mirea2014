/**
 * Created by sever on 15.03.2015.
 */
public class FileT{

    private String[] str;

    FileT(String[] mas, int cnt){
        this.str = new String[cnt];

       for (int i = 0; i < cnt; i++){
         this.str[i] = mas[i];
       }

    }

    public int getCount(){
        return this.str.length;
    }

    public void print(int id){
        System.out.println(this.str[id]);
    }

}
