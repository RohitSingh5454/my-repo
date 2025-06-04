package Java8_150Coding.Thirteen13_Jan;

import java.util.Arrays;
import java.util.List;

public class NoneMatchAllMatchFirstMatch {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Raghav","Puneet","Sachin","Parmeshwar","Vikrant");
        int a=list.size();
        System.out.println(a);
       if (list.stream().noneMatch(i->i.length()>10)){
           System.out.println("Element matched");
       }/*- else if (list.stream().noneMatch(i->i.length()==6)) {
           System.out.println("Element matched in list");
       }*/
    }
}
