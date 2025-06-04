package InterviewPreparation;

import java.util.HashSet;

public class duplicateStringsentence {
    public static void main(String[] args) {
        String[] s1={"Two","Three","Four","Five"};
        String[] s2={"One","Two","Five","Seven"};
        HashSet<String> unique=new HashSet<>();
        for (int i=0;i<s1.length;i++){
            for (int j=0;j<s2.length;j++){
                if (s1[i].equals(s2[j])){
                    unique.add(s1[i]);
                }
            }
        }
        System.out.println(unique);
    }
}
