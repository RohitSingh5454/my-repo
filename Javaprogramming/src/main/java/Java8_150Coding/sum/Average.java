package Java8_150Coding.sum;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().mapToInt(i->i).average().ifPresent(avg-> System.out.println("AVerage is "+avg));

        // another way
        int sum=0;
        for (int i:list) {
            sum = sum + i;
        }
            if (list.isEmpty()){
                System.out.println("List is empty");
            }
            else {
                System.out.println("Averagr is "+sum/(double) list.size());
            }
        }

}
