package AbhinavSirLabWork.InterviewCoding.wisson;

import java.util.HashMap;

public class hashmapImplementation {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(new Integer("1"),11);
        hm.put(new Integer("1"),12);
        System.out.println(hm.get(new Integer("1")));
        System.out.println(hm);
    }
}
