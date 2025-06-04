package GfgPractice.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Gfg {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,22,32,443,39,43,8);
            EvenList(integerList);
    }
    public static void EvenList(List<Integer> integerList){
      integerList.stream().filter(i->i%2==0).forEach(x->{
          System.out.print(x+" ");
      });
    }
}
