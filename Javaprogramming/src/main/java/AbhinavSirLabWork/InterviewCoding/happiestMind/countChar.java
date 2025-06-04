package AbhinavSirLabWork.InterviewCoding.happiestMind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countChar {
    public static void main(String[] args) {
        String str = "abajjkaaannbbb";
        char[] str1 = str.toCharArray();
        HashMap<Character, Long> hm = new HashMap<>();
        Map<String, Long> charCount = Arrays.stream(str.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
        // for (int i=0;i<str1.length;i++){
        for (char ch : str1) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1L);
            }
        }
        System.out.println(hm);
//       for (Map.Entry entry: hm.entrySet()){
//           System.out.println(entry.getKey()+" "+entry.getValue());
//       }
    }
}
