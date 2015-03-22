import java.math.BigInteger;


/**
 * Created by sever on 22.03.2015.
 */
public class NaturalNumber implements Iterator{
    private BigInteger cnt = new BigInteger("0");
    private BigInteger c = new BigInteger("1");

    public BigInteger next(){
        cnt = cnt.add(c);
        return cnt;
    }

    public boolean hasNext(){
        return true;
    }

}
