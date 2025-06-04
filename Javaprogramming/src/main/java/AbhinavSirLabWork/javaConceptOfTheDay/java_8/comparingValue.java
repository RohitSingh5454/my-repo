package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class comparingValue {
    public static void main(String[] args) {
        Map<Integer, String> idNameMap = new HashMap<Integer, String>();

        //Insert Id-Name pairs into idNameMap

        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");
       Map<Integer,String> sortByValue= idNameMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2, LinkedHashMap::new));
        System.out.println(sortByValue);
    }
}
