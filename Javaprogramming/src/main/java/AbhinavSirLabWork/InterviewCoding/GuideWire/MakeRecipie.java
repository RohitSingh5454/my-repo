package AbhinavSirLabWork.InterviewCoding.GuideWire;

import java.util.HashMap;

public class MakeRecipie {
    public static void main(String[] args) {
        String[] strings={"toast","bread","breada","cheese"};
        String availableIngredients="abcdeeehrs";
        int count=makeDishes(strings,availableIngredients);
        System.out.println(count);
    }
    private static int makeDishes(String[] str,String availableIngredients){
        HashMap<Character,Integer> availableCount=getFrequencyMap(availableIngredients);
        int count=0;
        for (String recipe:str){
            HashMap<Character, Integer> recipeCount = getFrequencyMap(recipe);
            if(canPrepare(recipeCount,availableCount)){
               count++;
            }
        }
        return count;
    }
    private static boolean canPrepare(HashMap<Character,Integer> recipeCount,HashMap<Character,Integer> availableCount){
       for (char ingredient:recipeCount.keySet()){
           if (recipeCount.get(ingredient)>availableCount.getOrDefault(ingredient,0)){
               return false;
           }
       }
       return true;
    }
    private static HashMap<Character,Integer> getFrequencyMap(String str){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (char ch:str.toCharArray()){
            if (hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }else {
                hashMap.put(ch,1);
            }
        }
        return hashMap;
    }
}
