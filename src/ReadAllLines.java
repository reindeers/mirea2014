import java.util.ArrayList;

/**
 * Created by m.vlasova on 20.03.2015.
 */
public class ReadAllLines implements LineProcessor {
    ArrayList<String> lines = new ArrayList<String>();

    public void processLine(String str){
        this.lines.add(str);
    }

    public String[] getAllLines(){
        String[] rs = new String[this.lines.size()];
        for(int i=0; i < this.lines.size(); i++){
            rs[i] = this.lines.get(i);
        }
        return rs;
    }
}
