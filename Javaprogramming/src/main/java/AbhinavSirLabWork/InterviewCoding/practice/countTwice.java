package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class countTwice {
    public static void main(String[] args) {
        System.out.println( ifDiplicate(new int[]{1,2,1,3,4,5,6}));
    }
    public static boolean ifDiplicate(int[] arr1){
        List<Integer> list= Arrays.stream(arr1).boxed().collect(Collectors.toList());
        HashSet<Integer> hs=new HashSet<>(list);
        if (hs.size()==list.size()){
            return false;
        }
        return true;
    }
}
