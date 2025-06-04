package AbhinavSirLabWork.InterviewCoding.AccoliteDigital;

import java.util.HashMap;
import java.util.Map;

public class SortArrayOccWise {
    public static void main(String[] args) {
        int[] array={1,2,3,2,3,4,3,5,3,5,3,4,5,4,4};
        sortArrayOccurenceWise(array
        );
    }
    public static void sortArrayOccurenceWise(int[] array){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (Integer in:array){
            if (hm.containsKey(in)){
                hm.put(in,hm.get(in)+1);
            }else {
                hm.put(in,1);
            }
        }
        int max_Key=1;
        int max_Value=1;
        for (Map.Entry<Integer,Integer> map: hm.entrySet()){
            System.out.print(map.getKey()+" ");
        }
    }
}
