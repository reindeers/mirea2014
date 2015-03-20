/**
 * Created by m.vlasova on 19.03.2015.
 */
public class OnlyCountLines implements LineProcessor {
    //String[] lines = new String[100];
    private int cnt = 0;
    public void processLine(String str){
      //  this.lines[this.cnt] = str;
        this.cnt++;


    }

    public int getCount(){
        return this.cnt;
    }
}
