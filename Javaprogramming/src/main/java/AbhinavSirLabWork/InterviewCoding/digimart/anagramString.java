package AbhinavSirLabWork.InterviewCoding.digimart;

import java.util.*;

public class anagramString {
    public static void main(String[] args) {
        String[] list= {"eat","tea","tan","ate","nat","bat"};
        anagramString ob1=new anagramString();
        ob1.groupAnagrams(list);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String temp = strs[i];
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            String x = new String(ch);
            System.out.println(x);
            if(map.containsKey(x)){
                List<String> li = map.get(x);
                li.add(strs[i]);
                map.put(x, li);
            }else{
                List<String> li = new ArrayList<>();
                li.add(strs[i]);
                map.put(x, li);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
