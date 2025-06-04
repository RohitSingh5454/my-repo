package AbhinavSirLabWork.BigDecimal;

import java.math.BigDecimal;

public class Lab701 {
    public static void main(String[] args) {
        double d=Double.MAX_VALUE;
        double c=d+100;
        System.out.println("Max value is  : "+d);
        System.out.println("Value after add is : "+c);
        System.out.println("---------------------------");
        BigDecimal bdec=new BigDecimal(Double.MAX_VALUE);
        System.out.println(bdec);
        BigDecimal bdec1=new BigDecimal(100);
        BigDecimal dec2=bdec.add(bdec1);
        System.out.println(dec2);
        BigDecimal bdec3=new BigDecimal(Double.POSITIVE_INFINITY);
        System.out.println(bdec3);

    }
}
