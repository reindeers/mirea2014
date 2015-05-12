import java.math.BigInteger;
import java.util.Iterator;

/**
 * Created by sever on 22.03.2015.
 */
public class FibonacciNumber implements Iterator<BigInteger> {
    private BigInteger fb0 = new BigInteger("0");
    private BigInteger fb1 = new BigInteger("1");
    public BigInteger next(){
            BigInteger tmp  = fb0;
            fb0 = fb1;
            fb1 = fb1.add(tmp);
            return fb0;


    }


    public boolean hasNext(){
        return true;
    }
    public void remove(){ }
}
