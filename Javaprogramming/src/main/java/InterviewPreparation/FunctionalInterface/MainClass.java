package InterviewPreparation.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainClass {
    public static void main(String[] args) {
        /*Kopa k1=(s1,s2)-> s1+" "+s2;
        System.out.println(k1.test("sakala","Boom Boom"));*/
        Function<Integer,String> f1=(i)->"output: "+i;
        System.out.println(f1.apply(45));
        List<Integer> l1= Arrays.asList(1,5,2,8,7,55,98,23,65);
        MainClass obj1=new MainClass();
        Predicate<Integer> predicate=i->i>4;
        l1.stream().filter(predicate).sorted().forEach(obj1::PrintElem);

    }
    public  void PrintElem(int i){
        System.out.print(i+" ");
    }
}
