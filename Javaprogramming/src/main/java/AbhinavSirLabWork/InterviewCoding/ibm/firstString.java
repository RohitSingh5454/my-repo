package AbhinavSirLabWork.InterviewCoding.ibm;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.Collectors;

public class firstString {
    public static void main(String[] args) {
        //print o/p-Rohit Manohar
        ImmutableList<String> stringImmutableList=ImmutableList.of("Rohit singh" ,"Manohar patrika");
       List<String> strings= stringImmutableList.stream().map(i->i.split(" ")[0]).collect(Collectors.toList());
        System.out.println(strings);
    }
}
