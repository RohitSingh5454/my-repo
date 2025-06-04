package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class cubeListAndFilter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
      List<Integer> list=  integerList.stream().map(i->i*i*i).filter(i->i>50).collect(Collectors.toList());
        System.out.println(list);
    }
}
