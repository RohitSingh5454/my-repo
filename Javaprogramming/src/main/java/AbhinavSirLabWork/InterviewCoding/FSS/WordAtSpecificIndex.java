package AbhinavSirLabWork.InterviewCoding.FSS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WordAtSpecificIndex {
    public static void main(String[] args) {
        List<String> list = List.of("ECE:EEE:CSC:IT", "ECE:EEE:IT:EEE","ECE:EEE:CSC:CSC",
                "CSC:EEE:ECE:IT","CSC:IT:IT:EEE");
        //Output: String str = "CSC_IT_ECE";
        Map<String,Long> countWord=list.stream().flatMap(s-> Arrays.stream(s.split(":")))
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));
        Set<String> hs=list.stream().map(i->i.split(":")[2]+"_").collect(Collectors.toSet());
        System.out.println(hs);
        String str=hs.stream().collect(Collectors.joining(""));
        System.out.println(str);
        String strs=countWord.entrySet().stream().filter(i->i.getValue()==3).map(Map.Entry::getKey).sorted()
                .collect(Collectors.joining("_"));
        //System.out.println(str);
    }
}
