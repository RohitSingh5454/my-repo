package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NonRepeated {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,3,4,5,2,7,8);
        HashSet<Integer> hs=new HashSet<>();
        for (int i:list){
            if (hs.contains(i)){
                hs.remove(i);
            }else {
                hs.add(i);
            }
        }
        System.out.println(hs);
    }
}
