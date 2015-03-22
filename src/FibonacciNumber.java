import java.math.BigInteger;

/**
 * Created by sever on 22.03.2015.
 */
public class FibonacciNumber implements Iterator {
    private int c = 0;
    private BigInteger pcnt1 = new BigInteger("0");
    private BigInteger pcnt2 = new BigInteger("1");
    private BigInteger cnt = new BigInteger("0");
    public BigInteger next(){
        if (this.c == 0) {c++; return cnt;}
        else if (this.c == 1) {c++; cnt = new BigInteger("1"); return cnt;}
        else {
            cnt = pcnt1.add(pcnt2);
            pcnt1 = pcnt2;
            pcnt2 = cnt;
            c++;
            return cnt;
        }

    }
}
