/**
 * Created by M.Vlasova on 19.05.2015.
 */

import java.lang.Iterable;
import java.util.Iterator;

public class NaturalNumberItrbl implements Iterable{
    public Iterator iterator(){
        return new NaturalNumber();
    }

}
