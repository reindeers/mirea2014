import java.math.BigInteger;
import java.util.Iterator;


/**
 * Created by sever on 22.03.2015.
 */
public class NaturalNumber implements Iterator<BigInteger>{
    private BigInteger cnt = new BigInteger("0");

    public BigInteger next(){
        cnt = cnt.add(BigInteger.ONE);
        return cnt;
    }

    public boolean hasNext(){
        return true;
    }

    public void remove(){ }

}
