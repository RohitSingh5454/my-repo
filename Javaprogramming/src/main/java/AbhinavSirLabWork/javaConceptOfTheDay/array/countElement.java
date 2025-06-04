package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.HashMap;

public class countElement {
    public static void main(String[] args) {
        int[] array={1,2,4,6,3,7,2,5,4};
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i:array){
            if (hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i)+1);
            }
            else {
                hashMap.put(i,1);
            }
        }
        System.out.println("Count of elements are "+hashMap);
    }
}
