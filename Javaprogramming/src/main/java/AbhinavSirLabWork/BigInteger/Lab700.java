package AbhinavSirLabWork.BigInteger;

import java.math.BigInteger;

public class Lab700 {
    public static void main(String[] args) {
        BigInteger bin=new BigInteger("919191911991919199191991919191991911001010");
        BigInteger bin2=new BigInteger("71718871119717919717991797197179971");
        BigInteger bin3=bin.add(bin2);
        System.out.println(bin3);
    }
}
