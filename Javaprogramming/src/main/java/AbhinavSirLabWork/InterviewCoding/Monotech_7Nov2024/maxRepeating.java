package AbhinavSirLabWork.InterviewCoding.Monotech_7Nov2024;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class maxRepeating {
    public static Map<Character,Integer> maxRepeatingChar(String str){
        char chars[]=str.toCharArray();
        HashMap<Character, Integer> hm=new HashMap<>();
        for (Character ch:chars){
            if (hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else {
                hm.put(ch,1);
            }
        }
        char maxChar=' ';
        int frequency=1;
        for (Map.Entry<Character,Integer> maps:hm.entrySet()){
            if (maps.getValue()>frequency){
                maxChar=maps.getKey();
                frequency= maps.getValue();;
            }
        }
        HashMap<Character,Integer> hashMap=new HashMap<>();
        hashMap.put(maxChar,hm.get(maxChar));
        return hashMap;
    }
    public static void maxRepeatingString(List<String> str){
        HashMap<String,Integer> hm=new HashMap<>();
        for (String s:str){
            if (hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }
            else {
                hm.put(s,1);
            }
        }
        String sts=" ";
        List<String> maxString=new ArrayList<>();
        int frequency=1;
        for (Map.Entry<String,Integer> entry: hm.entrySet()){
            if (entry.getValue()>frequency){
                frequency=entry.getValue();
                //sts= entry.getKey();
                maxString.clear();
                maxString.add(entry.getKey());
            }
            else if (entry.getValue()==frequency){
                maxString.add(entry.getKey());
            }
        }
        System.out.println("Maximum string present is "+maxString+" "+"and occurence is present "+frequency);
    }
    // using java-8
    public static char maximumCharacter(String str){
        return str.chars().mapToObj(ch->(char) ch).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().
                stream().max(Comparator.comparingLong(Map.Entry::getValue)).get().getKey();
    }

    public static void main(String[] args) {
        System.out.println(maxRepeatingChar("browwwn lazy fox is runnnnnnnning late."));
        maxRepeatingString(Arrays.asList("Hello","Java","Programming","language","Hello","Java","hello"));
        System.out.println(maximumCharacter("browwwn lazy fox is runnnnnnnning late."));
    }

}
