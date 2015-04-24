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
        return lines.toArray(new String[lines.size()]);
    }
}
