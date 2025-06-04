package AbhinavSirLabWork.File_Handling;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;

public class Arrays {
    public static void main(String[] args) {
//        Sort an array according to their frequencies in desc order
//        Input: nums = [3,2,3,1,2,3,4]
//        Output : [3,3,3,2,2,1,4]
         int[] nums={3,2,3,1,2,3,4};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }

       List<Map.Entry> list= hm.entrySet().stream().sorted(Comparator.comparingInt(i->i.getValue())).collect(Collectors.toList());
        System.out.println(list);
    }
}
