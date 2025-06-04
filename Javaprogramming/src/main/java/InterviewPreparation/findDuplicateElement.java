package InterviewPreparation;

import java.util.HashSet;

public class findDuplicateElement {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b={7,8,9,11,2,3};
        int[] temp=new int[b.length];
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if (a[i]==b[j]){
                    hashSet.add(a[i]);
                    break;
                }
            }
        }
        for (int has:hashSet){
            System.out.print(has+ " ");
        }
    }
}
