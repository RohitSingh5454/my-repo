package AbhinavSirLabWork.InterviewCoding.nelsen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatedElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,3,4,5,2,7,8);
        // op-1 4 5 7 8
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (Integer i:list){
            if (hm.containsKey(i)){
                hm.remove(i);
            }
            else {
                hm.put(i,1);
            }
        }
        System.out.println(hm);
        for (Map.Entry<Integer,Integer> map: hm.entrySet()){
            System.out.print(map.getKey()+" ");
        }
    }
}
