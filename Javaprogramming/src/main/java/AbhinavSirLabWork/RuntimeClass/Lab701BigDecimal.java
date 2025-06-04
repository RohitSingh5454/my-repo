package AbhinavSirLabWork.RuntimeClass;

import java.math.BigDecimal;

public class Lab701BigDecimal {
    public static void main(String[] args) {
        double d1=Double.MAX_VALUE;
        System.out.println(d1);
        double d2=d1+100;
        System.out.println(d2);
        System.out.println("************");
        BigDecimal bigDec1=new BigDecimal(Double.MAX_VALUE);
       // BigDecimal bigDec2=new BigDecimal("");
       // BigDecimal res1=bigDec1.add(bigDec2);
        BigDecimal bigDec3=new BigDecimal(Double.POSITIVE_INFINITY);
        System.out.println(bigDec1);
        System.out.println(bigDec3);
    }
}
