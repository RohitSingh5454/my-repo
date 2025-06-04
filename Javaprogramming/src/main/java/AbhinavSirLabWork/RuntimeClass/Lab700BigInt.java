package AbhinavSirLabWork.RuntimeClass;

import java.math.BigInteger;

public class Lab700BigInt {
    public static void main(String[] args) {
        BigInteger bint=new BigInteger("9223372036854775807");
        System.out.println(bint);
        BigInteger bint2=new BigInteger("191991991");
        BigInteger res1=bint.add(bint2);
        System.out.println(res1);
    }
}
