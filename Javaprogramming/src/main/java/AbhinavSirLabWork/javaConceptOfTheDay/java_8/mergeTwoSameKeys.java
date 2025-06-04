package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeTwoSameKeys {
    public static void main(String[] args) {
        HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();

        subjectToStudentCountMap1.put("Maths", 45);
        subjectToStudentCountMap1.put("Physics", 57);
        subjectToStudentCountMap1.put("Chemistry", 52);
        subjectToStudentCountMap1.put("History", 41);

        //Map-2

        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();

        subjectToStudentCountMap2.put("Economics", 49);
        subjectToStudentCountMap2.put("Maths", 42);
        subjectToStudentCountMap2.put("Biology", 41);
        subjectToStudentCountMap2.put("History", 55);
        HashMap<String,Integer> hs=new HashMap<>(subjectToStudentCountMap1);
        subjectToStudentCountMap2.forEach((key,value)-> hs.merge(key,value,(v1,v2)->v1+v2));
        // another way
       HashMap<String,Integer> resultMap= Stream.of(subjectToStudentCountMap1,subjectToStudentCountMap2).flatMap(map-> map.entrySet().stream())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,Integer::sum,HashMap::new));

        System.out.println("Map 1 "+subjectToStudentCountMap1);
        System.out.println("Map 2 "+subjectToStudentCountMap2);
        System.out.println("Map 3 "+resultMap);
    }
}
