package AbhinavSirLabWork.RuntimeClass;

import java.math.BigInteger;

public class Lab699BigInteger {
    public static void main(String[] args) {
        BigInteger bint=new BigInteger("5");
        System.out.println(bint.bitCount());
        System.out.println(bint.bitLength());
        long val=9223372036854775807L;
        long val2=val+100;
        System.out.println(val);
        System.out.println(val2);

    }
}
