package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicateString {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Raghav","Sachin","Naresh","Raghav");
        List<String> list1=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(i) ==list.get(j)){
                    list1.add(list.get(i));
                }
            }
        }
        System.out.println(list1);
    }
}
