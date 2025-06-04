package AbhinavSirLabWork.InterviewCoding.ThreePillar;

import java.util.ArrayList;
import java.util.List;

public class finalList {
    public static void main(String[] args) {
       final List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(31);
        list.add(46);
        list.add(98);
        list.add(56);
        list.add(12);
        list.add(98);
        list.add(69);
        list.add(77);
        list.add(56);
        System.out.println(list);
        List list1=new ArrayList<>();
        list1.addAll(list);
        list1.add(104);
        System.out.println(list1);
    }
}
