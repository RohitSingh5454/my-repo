package AbhinavSirLabWork.InterviewCoding.iexceed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int target=7;
        for (int i=0;i<list.size();i++){
            int num=target- list.get(i);
            if (hm.containsKey(num)){
                System.out.println(num+" "+ list.get(i));
            }else {
                hm.put(list.get(i),i);
            }
        }
    }
}
